/**
 * @(#) IBaseBS.java  1.0  July. 31, 2017
 *
 */
package how2java.util;

import java.io.Serializable;
import java.util.List;

import how2java.param.QueryParam;
import org.springframework.jdbc.core.ConnectionCallback;



/**
 * 封装DAO层操作
 * 同时提供平台级别的公用业务方法
 * @author Administrator
 *
 */
public interface IBaseBS {
    public static final String BEAN_ID="baseBS";




    /**
     * 根据组织ID获取指定的管辖部门Json字符串,查询不到返回空字符串
     * @param orgId 组织ID
     * @return Json字符串
     */
    public String getAdminDeptJson(String orgId);


    /**
     * 根据字典类型名称和数据名称 获取 数据字值，如果查询不到返回null
     * @param dictionaryType 数据字典类型，不能为空
     * @param dictName
     * @return dictionary value
     */
    public String queryDictValueByTypeName(String dictionaryType, String dictName);

    /**
     * 查询获取配置在数据字典表的系统参数，数据字典类型是SYS_PARAM_CONFIG
     * @param paramName 系统参数名
     * @return String 系统参数值
     */
    public String getSysParam(String paramName);


    //===================常用方法=====================
    /**
     * 平台框架获取UUID主键
     * 该方法目前生成一个全球唯一的32位字符串
     * @return 32位UUID字符串
     */
    public String txNewUUID();

    /**
     * 获取系统序列号，在T_SMN_SERIAL_NUMB表中维护
     * @param codeName 序列号唯一标识，不能为空
     * @param codePrefix 序列号前缀，前缀为null或空字符串时，则取配置表里的前缀
     * @param codeStep 序列号步长，为0时则取配置表里的步长
     * @return 前缀加上序列号值的字符串
     */
    public String getSerialCode(String codeName, String codePrefix, int codeStep);


    //=====================dao method agent=======================
    /**
     * 通过主键查询Hibernate对象。
     * @return
     */
    public Object queryHibernateObjById(Class clazz, Serializable id);
    



    /**
     * Hibernate对象批量新增或修改
     * @param list
     */
    public void saveOrUpdateHibernateObjByBatch(List list);
    


    /**
     * 通用查询记录。
     *
     * @return List 对象列表。
     */
    public List query(QueryParam qp);
    
    /**
     * 通用查询总记录数

     * @return int 符合条件的记录数。
     */
    public int querySize(QueryParam qp);
    
    /**
     * 通用查询单记录。
     *
     * @return Object 第一个符合条件的记录对象。
     */
    public Object queryOne(QueryParam qp);
    
    /**
     * 通过MyBatis进行新建操作。
     * @param statementId insert语句定义ID。
     *
     * @return 
     */
    public int insertMyBatisObj(String statementId, Object values);
    
    /**
     * 通过MyBatis进行删除操作。
     * @param statementId delete语句定义ID。
     *
     * @return
     */
    public int deleteMyBatisObj(String statementId, Object values);
    
    /**
     * 通过MyBatis进行修改操作。
     * @param statementId update语句定义ID。

     * @return
     */
    public int updateMyBatisObj(String statementId, Object values);
    
    /**
     * 通过Jdbc Callback来进行数据库操作。
     * @param callback
     *
     */
    public Object execute(ConnectionCallback callback);

}
