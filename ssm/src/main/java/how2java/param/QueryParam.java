/**
 * @(#) QueryParam.java  1.0  Nov. 15, 2013
 *
 */
package how2java.param;

import java.io.Serializable;
import java.util.Map;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class QueryParam {
	public static final String OP_EQ = "=";
	public static final String OP_NOTEQ = "!=";
	public static final String OP_GT = ">";
	public static final String OP_LT = "<";
	public static final String OP_GTEQ = ">=";
	public static final String OP_LTEQ = "<=";
	public static final String OP_LIKE = "like";
	public static final String OP_IN = "in";
	public static final String OP_NOTIN = "not in";
	/**
	 * 单实体查询方式，按主键查询。
	 * @param clazz        po类。
	 * @param identifier   主键。
	 */
	public static QueryParam getInstance(Class clazz, Serializable identifier) {
		return new EntityPkQueryParam(clazz, identifier);
	}
	/**
	 * 单实体查询方式，按提供的条件等查询。offset等于-1而且size等于-1表示不分页查。
	 * @param clazz           po类。
	 * @param queryFields     条件的属性名数组。
	 * @param queryOperators  条件的比较符数组，“=,<>,!=,like”，数组长度要和queryFields相同。null或空表示都用“=”。
	 * @param queryValues     条件的比较值数组，数组长度要和filterFields相同。
	 * @param orderBy         排序字符串，不含order by字符串
	 * @param groupBy         分组字符串，不含order by字符串
	 * @param otherCause      where后其他语句;如order by,group by后的having语句
	 * @param offset          查询结果的起始行，从0开始。如果不需要分页，则设置为-1
	 * @param size            查询结果的最大行数。如果不需要分页，则设置为-1
	 * @return
	 */
	public static QueryParam getInstance(Class clazz, String[] queryFields,	String[] queryOperators, Object[] queryValues, 
			String orderBy,String groupBy, String otherCause, int offset, int size) {
		return new EntityQueryParam(clazz, queryFields,queryOperators, queryValues,
				orderBy, groupBy, otherCause,offset, size);
	}
	/**
	 * 单实体查询方式，按提供的条件等查询，不分页查。
	 * @param clazz            po类。
	 * @param queryFields      条件的属性名数组。
	 * @param queryOperators   条件的比较符数组，“=,<>,!=,like”，数组长度要和queryFields相同。null或空表示都用“=”。
	 * @param queryValues      条件的比较值数组，数组长度要和filterFields相同。
	 * @param orderBy          排序字符串，不含order by字符串
	 * @param groupBy          分组字符串，不含group by字符串
	 * @param otherCause       where后其他语句;如order by,group by后的having语句
	 * @return
	 */
	public static QueryParam getInstance(Class clazz, String[] queryFields,String[] queryOperators, Object[] queryValues, 
			String orderBy,String groupBy, String otherCause) {
		return getInstance(clazz, queryFields, queryOperators, queryValues,
				orderBy, groupBy, otherCause, -1, -1);
	}
	/**
	 * 单实体查询方式，按提供的条件等查询，不排序。
	 * @param clazz            po类。
	 * @param queryFields      条件的属性名数组。
	 * @param queryOperators   条件的比较符数组，“=,<>,!=,like”，数组长度要和queryFields相同。null或空表示都用“=”。
	 * @param queryValues      条件的比较值数组，数组长度要和filterFields相同。
	 * @param offset           查询结果的起始行，从0开始。如果不需要分页，则设置为-1
	 * @param size             查询结果的最大行数。如果不需要分页，则设置为-1
	 * @return
	 */
	public static QueryParam getInstance(Class clazz, String[] queryFields,String[] queryOperators, Object[] queryValues,
			int offset, int size) {
		return new EntityQueryParam(clazz, queryFields,
				queryOperators, queryValues, null, null, null, offset, size);
	}
	/**
	 * 单实体查询方式，按提供的条件等查询，不排序不分页查。
	 * @param clazz            po类。
	 * @param queryFields      条件的属性名数组。
	 * @param queryOperators   条件的比较符数组，“=,<>,!=,like”，数组长度要和queryFields相同。null或空表示都用“=”。
	 * @param queryValues      条件的比较值数组，数组长度要和filterFields相同。
	 * @return
	 */
	public static QueryParam getInstance(Class clazz, String[] queryFields,
			String[] queryOperators, Object[] queryValues) {
		return new EntityQueryParam(clazz, queryFields,
				queryOperators, queryValues, null, null, null, -1, -1);
	}
	/**
	 * 单实体查询方式，取得所有的记录。
	 * @param clazz           po类。
	 * @return
	 */
	public static QueryParam getInstance(Class clazz) {
		return new EntityQueryParam(clazz, null, null, null, null,null, null, -1, -1);
	}
	/**
	 * 使用HQL查询，参数map分页查。
	 * @param queryHql            HQL查询语句，其中参数使用名称（:param）形式。
	 * @param queryNamedValues    以Map的形式封装的参数值，key是参数名，value为参数值。
	 * @param offset              第一条记录的位置，0表示第一条。如果不需要分页，则设置为-1
	 * @param size                本次取得记录数。如果不需要分页，则设置为-1
	 * @return
	 */
	public static QueryParam getInstance(String queryHql, Map queryNamedValues,int offset, int size) {
		return new HqlQueryParamByMap(queryHql, queryNamedValues,offset, size);
	}
	/**
	 * 使用HQL查询，参数map不分页查。
	 * @param queryHql            HQL查询语句，其中参数使用名称（:param）形式。
	 * @param queryNamedValues    以Map的形式封装的参数值，key是参数名，value为参数值。
	 * @return
	 */
	public static QueryParam getInstance(String queryHql, Map queryNamedValues) {
		return getInstance(queryHql, queryNamedValues, -1, -1);
	}
	/**
	 * 使用HQL查询，数组参数分页查。
	 * @param queryHql            HQL查询语句，其中参数使用?形式。
	 * @param queryValues         以数组的形式封装的参数值。
	 * @param offset              第一条记录的位置，0表示第一条。如果不需要分页，则设置为-1
	 * @param size                本次取得记录数。如果不需要分页，则设置为-1
	 * @return
	 */
	public static QueryParam getInstance(String queryHql, Object[] queryValues,int offset, int size) {
		return new HqlQueryParamByArray(queryHql, queryValues,offset, size);
	}
	/**
	 * 使用HQL查询，数组参数不分页查。
	 * @param queryHql            HQL查询语句，其中参数使用?形式。
	 * @param queryValues         以数组的形式封装的参数值。
	 * @return
	 */
	public static QueryParam getInstance(String queryHql, Object[] queryValues) {
		return getInstance(queryHql, queryValues, -1, -1);
	}
	/**
	 * 使用命名HQL查询，分页查。
	 * @param            -query hbm.xml定义查询语句的ID。
	 * @param queryValues     以数组的形式封装的参数值。
	 * @param offset          第一条记录的位置，0表示第一条。如果不需要分页，则设置为-1
	 * @param size            本次取得记录数。如果不需要分页，则设置为-1
	 * @return
	 */
	public static QueryParam getInstance3(String queryId, Object[] queryValues,int offset, int size) {
		return new HqlQueryParamByNamedQuery(queryId, queryValues,offset, size);
	}

	/**
	 * 使用iBatis方式查询，分页查。
	 * @param statementId            iBatis查询语句的ID。
	 * @param queryValues            参数值封装对象。
	 * @param offset                 第一条记录的位置，0表示第一条。如果不需要分页，则设置为-1
	 * @param size                   本次取得记录数。如果不需要分页，则设置为-1
	 * @return
	 */
    public static QueryParam getInstance2(String statementId,Object queryValues, int offset, int size) {
        //TODO data right option must get from dict
        String DATA_RIGHT_OPTION = "1";
        //拦截插入数据权限过滤字段
        ServletRequestAttributes reqAttr=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();


        return new MyBatisQueryParam(statementId, queryValues,offset, size);
    }

	/**
	 * 使用iBatis方式查询，不分页查。
	 * @param statementId            iBatis查询语句的ID。
	 * @param queryValues            参数值封装对象。
	 * @return
	 */
	public static QueryParam getInstance2(String statementId, Object queryValues) {
		return getInstance2(statementId, queryValues, -1, -1);
	}
	public static abstract class LimitableQueryParam extends QueryParam {
		private int offset = -1;
		private int size = -1;
		protected LimitableQueryParam(int offset, int size) {
			this.offset = offset;
			this.size = size;
		}
		public int getOffset() {
			return offset;
		}
		public int getSize() {
			return size;
		}
		public boolean isLimit() {
			return offset >= 0 && size > 0;
		}
		public void setOffset(int offset) {
			this.offset = offset;
		}
		public void setSize(int size) {
			this.size = size;
		}
	}
	public static class EntityQueryParam extends LimitableQueryParam {
		private Class clazz = null;
		private String[] queryFields = null;
		private String[] queryOperators = null;
		private Object[] queryValues = null;
		private String orderBy;
		private String groupBy;
		private String otherCause;
		protected EntityQueryParam(Class clazz, String[] queryFields,String[] queryOperators, Object[] queryValues, 
				String orderBy,String groupBy, String otherCause, int offset, int size) {
			super(offset, size);
			this.clazz = clazz;
			this.queryFields = queryFields;
			this.queryOperators = queryOperators;
			this.queryValues = queryValues;
			this.orderBy = orderBy;
			this.groupBy = groupBy;
			this.otherCause = otherCause;
		}
		public Class getClazz() {
			return clazz;
		}
		public String[] getQueryFields() {
			return queryFields;
		}
		public String[] getQueryOperators() {
			return queryOperators;
		}
		public Object[] getQueryValues() {
			return queryValues;
		}
		public String getOrderBy() {
			return orderBy;
		}
		public void setOrderBy(String orderBy) {
			this.orderBy = orderBy;
		}
		public String getGroupBy() {
			return groupBy;
		}
		public void setGroupBy(String groupBy) {
			this.groupBy = groupBy;
		}
		public String getOtherCause() {
			return otherCause;
		}
		public void setOtherCause(String otherCause) {
			this.otherCause = otherCause;
		}
	}
	public static class HqlQueryParamByArray extends LimitableQueryParam {
		private Object[] queryValues = null;
		private String queryHql = null;
		protected HqlQueryParamByArray(String queryHql, Object[] queryValues,int offset, int size) {
			super(offset, size);
			this.queryValues = queryValues;
			this.queryHql = queryHql;
		}
		public Object[] getQueryValues() {
			return queryValues;
		}
		public String getQueryHql() {
			return queryHql;
		}
	}
	public static class HqlQueryParamByMap extends LimitableQueryParam {
		private Map queryValues = null;
		private String queryHql = null;
		protected HqlQueryParamByMap(String queryHql, Map queryValues,int offset, int size) {
			super(offset, size);
			this.queryValues = queryValues;
			this.queryHql = queryHql;
		}
		public Map getQueryValues() {
			return queryValues;
		}
		public String getQueryHql() {
			return queryHql;
		}
	}
	public static class HqlQueryParamByNamedQuery extends LimitableQueryParam {
		private Object[] queryValues = null;
		private String queryId = null;
		private int offset = -1;
		private int size = -1;
		public HqlQueryParamByNamedQuery(String queryId, Object[] queryValues,int offset, int size) {
			super(offset, size);
			this.queryId = queryId;
			this.queryValues = queryValues;
		}
		public Object[] getQueryValues() {
			return queryValues;
		}
		public void setQueryValues(Object[] queryValues) {
			this.queryValues = queryValues;
		}
		public String getQueryId() {
			return queryId;
		}
		public void setQueryId(String queryId) {
			this.queryId = queryId;
		}
		public int getOffset() {
			return offset;
		}
		public void setOffset(int offset) {
			this.offset = offset;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
	}
	public static class MyBatisQueryParam extends LimitableQueryParam {
		private Object queryValues = null;
		private String statementId = null;
		protected MyBatisQueryParam(String statementId, Object queryValues,int offset, int size) {
			super(offset, size);
			this.queryValues = queryValues;
			this.statementId = statementId;
		}
		public Object getQueryValues() {
			return queryValues;
		}
		public String getStatementId() {
			return statementId;
		}
	}
	public static class EntityPkQueryParam extends QueryParam {
		private Class clazz = null;
		private Serializable identifier = null;
		protected EntityPkQueryParam(Class clazz, Serializable identifier) {
			this.clazz = clazz;
			this.identifier = identifier;

		}
		public Class getClazz() {
			return clazz;
		}
		public Serializable getIdentifier() {
			return identifier;
		}
	}
	protected QueryParam() {
	}
}
