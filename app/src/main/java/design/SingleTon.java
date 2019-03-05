package design;

/**
 * 创建单例模式的几种方法
 * author:Ken
 * time:2019/3/5
 */
public class SingleTon {
    /**
     * 创建静态引用
     */
    public static SingleTon singleTon;

    /**
     * 私有化构造方式，禁止外部调用
     */
    private SingleTon() {

    }

//    //懒汉式 因为虚拟机的代码编排问题，代码可能不是从上到下执行，所以加上volatile， synchronized可以保证线程安全
//    public volatile SingleTon singleTon;
//    public static SingleTon getInstance() {
//        if (singleTon == null) {
//            synchronized (SingleTon.class) {
//                if (singleTon == null) {
//                    singleTon = new SingleTon();
//                }
//            }
//        }
//        return singleTon;
//    }


//    //饿汉式 在对象声明时直接初始化对象，但当对象初始化比较复杂时，会导致程序初始化缓慢
//    public static SingleTon singleTon = new SingleTon();
//    public static SingleTon getInstance(){
//        return singleTon;
//    }


//    /**
//     * 静态内部类
//     */
//    private static class SingleHolder {
//        private static SingleTon singleTon = new SingleTon();
//    }
//
//    public static SingleTon getInstance() {
//        return SingleHolder.singleTon;
//    }

     // 静态代码块实现方式
    static {
        singleTon = new SingleTon();
    }

    public static SingleTon getInstance() {
        return singleTon;
    }

}
