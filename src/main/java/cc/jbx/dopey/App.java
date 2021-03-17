package cc.jbx.dopey;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final int MEGABYTE = 1024*1024;

    public static void main( String[] args ) {
        Runtime runtime = Runtime.getRuntime();
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        String version = bean.getVmVersion();
        String specVersion = bean.getSpecVersion();
        System.out.println("Heap:" + runtime.maxMemory() / MEGABYTE);
        System.out.println(specVersion + " " + version);
        for (String s : bean.getInputArguments()) {
            System.out.println(s);
        }
    }
}
