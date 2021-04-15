package com.hankun.neil.util;

import org.apache.lucene.util.RamUsageEstimator;

import java.util.ArrayList;

/**
 * @author neil
 * @ClassName: CaculateObjectSize
 * @Description: TODO
 * @date 2021/3/12 14:47
 */
public class CaculateObjectSize {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            objects.add("asd");
            objects.add("123");
            objects.add(123);
            objects.add("asd");
        }
        System.out.println(RamUsageEstimator.sizeOf(objects));
        System.out.println(RamUsageEstimator.shallowSizeOf(objects));
        System.out.println(RamUsageEstimator.humanSizeOf(objects));

    }
//    public static void main(String[] args) {
//        ExecutorService jPool = Executors.newFixedThreadPool(10);
//        //包装Java线程池，构造Guava 线程池
//        ListeningExecutorService gPool = MoreExecutors.listeningDecorator(jPool);
//        ListenableFuture<String> listenableFuture = gPool.submit(new MyJob());
//        Futures.addCallback(listenableFuture, new FutureCallback<String>() {
//            @Override
//            public void onSuccess(String s) {
//                System.out.println(s);
//            }
//
//            @Override
//            public void onFailure(Throwable throwable) {
//                System.out.println(throwable.getMessage());
//            }
//        });
//        System.out.println("fuck");
//    }
//
//    static class MyJob implements Callable<String>{
//
//        @Override
//        public String call() throws Exception {
//            ThreadUtil.safeSleep(5000L);
//            return "--------------";
//        }
//    }
}
