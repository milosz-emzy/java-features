//package synchronised;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//class Main {
//    public static void main(String[] args) {
//        final DataHolder dataHolder = new DataHolder();
//
//        int nThreads = 10;
//        try (final ExecutorService service = Executors.newFixedThreadPool(nThreads)) {
//            for (int i = 0; i < nThreads ; i++) {
//                System.out.println("Hehe");
//            }
//        }
//
////        Executors.newFixedThreadPool(nThreads).;
//
//        System.out.println(dataHolder.getValue());
//        // TODO check any and all
//        //executorService.invokeAny()
//        //executorService.invokeAll()
//
//    }
//}
