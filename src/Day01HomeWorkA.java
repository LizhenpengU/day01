/**
 * Created by dllo on 17/10/17.
 */
public class Day01HomeWorkA {
    //主方法 main方法
    //public:公有访问(可以调用)权限
    //static:静态修饰的
    //void:无返回值
    //main:方法名(Java规定,不允许自定义)
    //():括号 方法参数(主方法运行需要哪些条件)
    //String[]:字符串数组
    //args:自定义变量名,可以是 a,b
    //argument:参数

    public static void main (String[] args){
        //主函数的作用:
        //程序:事情执行的步骤(流程)
        //执行Java代码的入口
        //当通过JDK(开发工具包)编写完成代码后
        //借助JVM(虚拟机)和JRE(运行时环境)去运行程序
        //当程序运行后,系统会去寻找主入口
        //从主入口进入,运行执行代码
        //这种形式为:顺序结构
        System.out.println("你好，世界！");
        System.out.println("悯农");
        System.out.println("锄禾日当午,");
        System.out.println("汗滴禾下土.");
        System.out.print("谁知盘中餐,");
        System.out.print("粒粒皆辛苦.");

        /*
        println和print的区别:
            println : 输出后换行
            print : 只输出不换行
         */
        /*
        标识符(变量名)的命名规则:
            1.遵循驼峰结构
            2.字母(a~Z) 数字(0~9) 美元符$ 下划线_ 数字不能作为首字符
            3.不能把关键字和保留字作为标识符
        驼峰命名法:
            1.大驼峰(文件中):单词首字母全大写
            2.小驼峰(代码中
            ):第一个单词首字母小写,其他单词首字母全大写 如:myName
            3.最好要做的见名知意
         */
    }

}
