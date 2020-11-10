import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//指定注解保留到运行时
@Retention(RetentionPolicy.RUNTIME)
//指定注解可以修饰类、接口、枚举
@Target(ElementType.TYPE)
@interface MyTags
{
    MyTag[] value();
}