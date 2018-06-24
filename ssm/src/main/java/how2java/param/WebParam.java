/**
 * @(#) WebParam.java  1.0  Nov. 15, 2013
 *
 */
package how2java.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 封装Web层至Service层间的参数传递
 * @author Administrator
 *
 */
public class WebParam implements Serializable{
    private static final long serialVersionUID = 1L;

    private Map map = new HashMap();
	public static WebParam getInstance() {
		return new WebParam();
	}
	public Map getValueMap() {
		return map;
	}

	public BigDecimal getValueBigDecimal(Object key) {
		return (BigDecimal) map.get(key);
	}

	public Class getValueClass(Object key) {
		return (Class) map.get(key);
	}

	public Integer getValueInteger(Object key) {
		return (Integer) map.get(key);
	}

	public Long getValueLong(Object key) {
		return (Long) map.get(key);
	}

	public Object getValueObject(Object key) {
		return map.get(key);
	}

	public String getValueString(Object key) {
		return (String) map.get(key);
	}

	public WebParam setValue(Object key, Object value) {
		map.put(key, value);
		return this;
	}

	public WebParam setValue(Map values) {
		map.putAll(values);
		return this;
	}
}
