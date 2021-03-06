package maxfomtasknine;

import maxfomtasknine.annotations.XmlTypeName;
import maxfomtasknine.annotations.XmlName;

import java.lang.reflect.Field;

public class Util {
    public static String getFieldName(Field field) {

        if (field.isAnnotationPresent(XmlName.class)) {
            XmlName annotation = field.getAnnotation(XmlName.class);
            return annotation.fieldName();
        }

        return field.getName();
    }

    public static String getClassName(Class clazz) {
        if (clazz.isAnnotationPresent(XmlTypeName.class)) {
            XmlTypeName annotation = (XmlTypeName) clazz.getAnnotation(XmlTypeName.class);
            return annotation.className();
        }
        return clazz.getName();
    }

}
