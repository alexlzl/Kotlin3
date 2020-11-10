@MyTags({
        @MyTag(name="测试1",age=21),
        @MyTag(name="测试2",age=22)
})
public class Test1 {
    public static void main(String[] args)
    {
        //通过反射解析注解
        Class testClass= Test1.class;
        //获得MyTags注解
        MyTags myTagsAnnotation= (MyTags) testClass.getAnnotation(MyTags.class);
        //获得添加到里面的MyTag注解
        MyTag[] myTags=myTagsAnnotation.value();
        for(MyTag myTag : myTags)
        {
            System.out.println(String.format("name:%1$s,age:%2$d",myTag.name(),myTag.age()));
        }
    }
}
