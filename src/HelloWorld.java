/**
 * Created by dllo on 17/10/17.
 */

/**
 * 这是文档注释
 * 用于描述当前JAVA文件
 * @author Hellokity
 * @date 2017.10.17
 * @version 1.0
 */

    /*
    编程规范:
    1.所有代码都要写在{}里,大括号是成对出现的
        大括号的区域:作用域,代码块
    2.一行最好只写一句代码,结束使用分号;
    3.代码要进行格式化,段首缩进使用TAB键,可读性高
    4.代码的实现流程要加入注释说明
     */
    /*

    命名规范:
    名字-变量名-标识符
      1.名字中可以出现数字 字母 美元符$和下划线_,
        并且数字不可以作为首字符
        正例: myName car bike num8 _set
        反例: 8color +hello
      2.不能把关键字和保留字作为名字使用

      驼峰结构命名法:
      大驼峰:类名,文件名使用的驼峰
        MyName , Car , TheNumOfThisPerson
      小驼峰:除文件的命名全使用小驼峰
        myName , car , theNumOfThisPerson
        the9Ball , iHaveADog
      1.只有一个单词时,大驼峰首字母大写,小驼峰首字母小写
      2.两个或两个以上时
        第一个单词:大驼峰首字母大写,小驼峰首字母小写,其他单词首字母均大写
     */

public class HelloWorld {
    //注释
    //对代码加以说明,在代码中添加注意事项
    //作用:加强理解
    //注释的分类:
    //当前写在双斜线里的是 单行注释
    /*
        这是多行注释
        添加多行描述文字
     */

    public static void main(String[] args) {
        System.out.println(" 你好,世界! ");
        System.out.println("锄禾日当午");
        System.out.println("汗滴禾下土");
        System.out.println("李白二百五");
    }
}
