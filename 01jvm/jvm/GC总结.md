## 串行GC
### VM参数
> -Xmx512m -Xms512m -XX:+UseSerialGC -XX:+PrintGCDetails

### 运行程序，查看GC日志
```
[GC (Allocation Failure) [DefNew: 139776K->17472K(157248K), 0.0144391 secs] 139776K->37744K(506816K), 0.0144743 secs] [Times: user=0.00 sys=0.01, real=0.01 secs] 
[GC (Allocation Failure) [DefNew: 157187K->17471K(157248K), 0.0256392 secs] 177459K->87646K(506816K), 0.0256637 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
[GC (Allocation Failure) [DefNew: 157172K->17471K(157248K), 0.0160007 secs] 227347K->130367K(506816K), 0.0160267 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
[GC (Allocation Failure) [DefNew: 157213K->17471K(157248K), 0.0182875 secs] 270109K->175514K(506816K), 0.0183177 secs] [Times: user=0.00 sys=0.01, real=0.02 secs] 
[GC (Allocation Failure) [DefNew: 157247K->17471K(157248K), 0.0177034 secs] 315290K->222325K(506816K), 0.0177284 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
[GC (Allocation Failure) [DefNew: 157175K->17469K(157248K), 0.0155701 secs] 362028K->263057K(506816K), 0.0155939 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
[GC (Allocation Failure) [DefNew: 157245K->17470K(157248K), 0.0156858 secs] 402833K->302927K(506816K), 0.0157212 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
[GC (Allocation Failure) [DefNew: 157057K->17470K(157248K), 0.0169002 secs] 442513K->348346K(506816K), 0.0169261 secs] [Times: user=0.00 sys=0.02, real=0.02 secs] 
[GC (Allocation Failure) [DefNew: 157246K->157246K(157248K), 0.0000103 secs][Tenured: 330876K->275807K(349568K), 0.0276163 secs] 488122K->275807K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0336843 secs] [Times: user=0.01 sys=0.02, real=0.03 secs] 
[GC (Allocation Failure) [DefNew: 139235K->17471K(157248K), 0.0054989 secs] 415042K->321729K(506816K), 0.0055232 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
[GC (Allocation Failure) [DefNew: 157247K->157247K(157248K), 0.0000182 secs][Tenured: 304258K->296647K(349568K), 0.0326204 secs] 461505K->296647K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0326934 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
[GC (Allocation Failure) [DefNew: 139776K->17471K(157248K), 0.0062439 secs] 436423K->344877K(506816K), 0.0062722 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
[GC (Allocation Failure) [DefNew: 157138K->157138K(157248K), 0.0000110 secs][Tenured: 327406K->319669K(349568K), 0.0336757 secs] 484544K->319669K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0337232 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
[GC (Allocation Failure) [DefNew: 139776K->139776K(157248K), 0.0000103 secs][Tenured: 319669K->313397K(349568K), 0.0366248 secs] 459445K->313397K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0366694 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
[GC (Allocation Failure) [DefNew: 139776K->139776K(157248K), 0.0000102 secs][Tenured: 313397K->339846K(349568K), 0.0288313 secs] 453173K->339846K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0288767 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
[GC (Allocation Failure) [DefNew: 139558K->139558K(157248K), 0.0000115 secs][Tenured: 339846K->343849K(349568K), 0.0358078 secs] 479404K->343849K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0358601 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
[GC (Allocation Failure) [DefNew: 139776K->139776K(157248K), 0.0000097 secs][Tenured: 343849K->349505K(349568K), 0.0411566 secs] 483625K->352684K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0412138 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
[Full GC (Allocation Failure) [Tenured: 349505K->345477K(349568K), 0.0453731 secs] 506697K->345477K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0454090 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
[GC (Allocation Failure) [DefNew: 139776K->139776K(157248K), 0.0000107 secs][Tenured: 345477K->349003K(349568K), 0.0288105 secs] 485253K->368556K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0288624 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
[Full GC (Allocation Failure) [Tenured: 349423K->349508K(349568K), 0.0348078 secs] 506645K->365686K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0348420 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
[Full GC (Allocation Failure) [Tenured: 349562K->349317K(349568K), 0.0401092 secs] 506799K->368033K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0401368 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
[Full GC (Allocation Failure) [Tenured: 349317K->349225K(349568K), 0.0474917 secs] 506267K->359221K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0475212 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
[Full GC (Allocation Failure) [Tenured: 349519K->349537K(349568K), 0.0297066 secs] 506732K->379826K(506816K), [Metaspace: 3838K->3838K(1056768K)], 0.0297388 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
执行结束!共生成对象次数:12175
Heap
 def new generation   total 157248K, used 35966K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
  eden space 139776K,  25% used [0x00000000e0000000, 0x00000000e231fb90, 0x00000000e8880000)
  from space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
  to   space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
 tenured generation   total 349568K, used 349537K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
   the space 349568K,  99% used [0x00000000eaaa0000, 0x00000000ffff84c0, 0x00000000ffff8600, 0x0000000100000000)
 Metaspace       used 3853K, capacity 4572K, committed 4864K, reserved 1056768K
  class space    used 427K, capacity 460K, committed 512K, reserved 1048576K
```

### 分析
串行GC是单线程的垃圾收集器，年轻代使用`标记-复制`算法，老年代使用`标记--清除-整理`算法，每次GC都会触发全部空间的STW，效率比较低，只适合单核小内存的机器使用。


## PerNew + CMS
### VM 参数
> -Xmx512m -Xms512m -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps

### GC日志
```
2021-08-15T23:14:59.027+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.027+0800: [ParNew: 139776K->17471K(157248K), 0.0059830 secs] 139776K->42250K(506816K), 0.0060390 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:14:59.049+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.049+0800: [ParNew: 157247K->17470K(157248K), 0.0073966 secs] 182026K->78224K(506816K), 0.0074319 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
2021-08-15T23:14:59.070+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.070+0800: [ParNew: 157246K->17471K(157248K), 0.0167385 secs] 218000K->119207K(506816K), 0.0167765 secs] [Times: user=0.08 sys=0.03, real=0.02 secs] 
2021-08-15T23:14:59.105+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.105+0800: [ParNew: 157247K->17471K(157248K), 0.0210387 secs] 258983K->163133K(506816K), 0.0210742 secs] [Times: user=0.06 sys=0.01, real=0.02 secs] 
2021-08-15T23:14:59.141+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.141+0800: [ParNew: 157247K->17472K(157248K), 0.0167301 secs] 302909K->207295K(506816K), 0.0167609 secs] [Times: user=0.09 sys=0.02, real=0.02 secs] 
2021-08-15T23:14:59.158+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 189823K(349568K)] 210300K(506816K), 0.0001103 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.158+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.159+0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.159+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.159+0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.159+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.171+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.171+0800: [ParNew: 157248K->17470K(157248K), 0.0198265 secs] 347071K->257564K(506816K), 0.0198682 secs] [Times: user=0.06 sys=0.02, real=0.02 secs] 
2021-08-15T23:14:59.206+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.206+0800: [ParNew: 157246K->17471K(157248K), 0.0176534 secs] 397340K->301266K(506816K), 0.0176966 secs] [Times: user=0.08 sys=0.02, real=0.02 secs] 
2021-08-15T23:14:59.239+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.239+0800: [ParNew: 157247K->17470K(157248K), 0.0152076 secs] 441042K->339269K(506816K), 0.0152443 secs] [Times: user=0.09 sys=0.00, real=0.01 secs] 
2021-08-15T23:14:59.271+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.271+0800: [ParNew: 157246K->157246K(157248K), 0.0000172 secs]2021-08-15T23:14:59.271+0800: [CMS2021-08-15T23:14:59.271+0800: [CMS-concurrent-abortable-preclean: 0.004/0.112 secs] [Times: user=0.30 sys=0.03, real=0.11 secs] 
 (concurrent mode failure): 321799K->261027K(349568K), 0.0366334 secs] 479045K->261027K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0367169 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
2021-08-15T23:14:59.329+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.329+0800: [ParNew: 139776K->17471K(157248K), 0.0042756 secs] 400803K->301824K(506816K), 0.0043145 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:14:59.334+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 284353K(349568K)] 302535K(506816K), 0.0001332 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.334+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.335+0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.335+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.335+0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.335+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.349+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.349+0800: [ParNew: 157247K->17470K(157248K), 0.0092950 secs] 441600K->349498K(506816K), 0.0093295 secs] [Times: user=0.11 sys=0.00, real=0.01 secs] 
2021-08-15T23:14:59.358+0800: [CMS-concurrent-abortable-preclean: 0.000/0.023 secs] [Times: user=0.13 sys=0.00, real=0.02 secs] 
2021-08-15T23:14:59.358+0800: [GC (CMS Final Remark) [YG occupancy: 20379 K (157248 K)]2021-08-15T23:14:59.358+0800: [Rescan (parallel) , 0.0002134 secs]2021-08-15T23:14:59.358+0800: [weak refs processing, 0.0000058 secs]2021-08-15T23:14:59.358+0800: [class unloading, 0.0001734 secs]2021-08-15T23:14:59.358+0800: [scrub symbol table, 0.0003004 secs]2021-08-15T23:14:59.359+0800: [scrub string table, 0.0000809 secs][1 CMS-remark: 332027K(349568K)] 352407K(506816K), 0.0008064 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.359+0800: [CMS-concurrent-sweep-start]
2021-08-15T23:14:59.359+0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.359+0800: [CMS-concurrent-reset-start]
2021-08-15T23:14:59.359+0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.378+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.378+0800: [ParNew: 157233K->157233K(157248K), 0.0000140 secs]2021-08-15T23:14:59.378+0800: [CMS: 298037K->297401K(349568K), 0.0353608 secs] 455271K->297401K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0354205 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
2021-08-15T23:14:59.414+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 297401K(349568K)] 300244K(506816K), 0.0002778 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.414+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.415+0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.415+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.416+0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.416+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.436+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.436+0800: [ParNew: 139776K->17471K(157248K), 0.0059431 secs] 437177K->343340K(506816K), 0.0059917 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:14:59.462+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.462+0800: [ParNew: 156759K->156759K(157248K), 0.0000157 secs]2021-08-15T23:14:59.462+0800: [CMS2021-08-15T23:14:59.462+0800: [CMS-concurrent-abortable-preclean: 0.001/0.047 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
 (concurrent mode failure): 325868K->308431K(349568K), 0.0395931 secs] 482628K->308431K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0396657 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
2021-08-15T23:14:59.515+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.515+0800: [ParNew: 139776K->17470K(157248K), 0.0058287 secs] 448207K->353810K(506816K), 0.0058609 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:14:59.521+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 336339K(349568K)] 353979K(506816K), 0.0004698 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.522+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.523+0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.523+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.524+0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.524+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.524+0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.524+0800: [GC (CMS Final Remark) [YG occupancy: 36748 K (157248 K)]2021-08-15T23:14:59.524+0800: [Rescan (parallel) , 0.0005062 secs]2021-08-15T23:14:59.524+0800: [weak refs processing, 0.0000107 secs]2021-08-15T23:14:59.524+0800: [class unloading, 0.0002005 secs]2021-08-15T23:14:59.525+0800: [scrub symbol table, 0.0003004 secs]2021-08-15T23:14:59.525+0800: [scrub string table, 0.0001015 secs][1 CMS-remark: 336339K(349568K)] 373088K(506816K), 0.0011775 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.525+0800: [CMS-concurrent-sweep-start]
2021-08-15T23:14:59.525+0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.02 sys=0.02, real=0.00 secs] 
2021-08-15T23:14:59.526+0800: [CMS-concurrent-reset-start]
2021-08-15T23:14:59.526+0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.536+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.536+0800: [ParNew: 157246K->17469K(157248K), 0.0098167 secs] 455486K->363092K(506816K), 0.0098524 secs] [Times: user=0.09 sys=0.00, real=0.01 secs] 
2021-08-15T23:14:59.547+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 345622K(349568K)] 363380K(506816K), 0.0005387 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.547+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.548+0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.548+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.549+0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.549+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.549+0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.549+0800: [GC (CMS Final Remark) [YG occupancy: 38603 K (157248 K)]2021-08-15T23:14:59.549+0800: [Rescan (parallel) , 0.0002542 secs]2021-08-15T23:14:59.549+0800: [weak refs processing, 0.0000110 secs]2021-08-15T23:14:59.549+0800: [class unloading, 0.0001906 secs]2021-08-15T23:14:59.549+0800: [scrub symbol table, 0.0002975 secs]2021-08-15T23:14:59.550+0800: [scrub string table, 0.0001042 secs][1 CMS-remark: 345622K(349568K)] 384226K(506816K), 0.0009029 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.550+0800: [CMS-concurrent-sweep-start]
2021-08-15T23:14:59.550+0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.550+0800: [CMS-concurrent-reset-start]
2021-08-15T23:14:59.551+0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.561+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.561+0800: [ParNew: 157245K->157245K(157248K), 0.0000164 secs]2021-08-15T23:14:59.561+0800: [CMS: 306674K->328778K(349568K), 0.0379437 secs] 463920K->328778K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0380316 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
2021-08-15T23:14:59.599+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 328778K(349568K)] 329066K(506816K), 0.0001608 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.599+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.600+0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.600+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.601+0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.601+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.617+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.617+0800: [ParNew: 139776K->139776K(157248K), 0.0000143 secs]2021-08-15T23:14:59.617+0800: [CMS2021-08-15T23:14:59.617+0800: [CMS-concurrent-abortable-preclean: 0.000/0.016 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
 (concurrent mode failure): 328778K->327743K(349568K), 0.0430862 secs] 468554K->327743K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0431545 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
2021-08-15T23:14:59.674+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.674+0800: [ParNew: 139776K->139776K(157248K), 0.0000223 secs]2021-08-15T23:14:59.674+0800: [CMS: 327743K->331941K(349568K), 0.0423574 secs] 467519K->331941K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0424384 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
2021-08-15T23:14:59.716+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 331941K(349568K)] 334985K(506816K), 0.0000977 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.716+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.717+0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.717+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.718+0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.718+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.732+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.732+0800: [ParNew: 139759K->139759K(157248K), 0.0000135 secs]2021-08-15T23:14:59.732+0800: [CMS2021-08-15T23:14:59.732+0800: [CMS-concurrent-abortable-preclean: 0.000/0.014 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
 (concurrent mode failure): 331941K->338638K(349568K), 0.0426942 secs] 471700K->338638K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0427592 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
2021-08-15T23:14:59.788+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.788+0800: [ParNew: 139776K->139776K(157248K), 0.0000131 secs]2021-08-15T23:14:59.788+0800: [CMS: 338638K->342895K(349568K), 0.0413314 secs] 478414K->342895K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0413950 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
2021-08-15T23:14:59.829+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 342895K(349568K)] 343182K(506816K), 0.0001167 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.829+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.831+0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.831+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.831+0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.831+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.831+0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.831+0800: [GC (CMS Final Remark) [YG occupancy: 14741 K (157248 K)]2021-08-15T23:14:59.831+0800: [Rescan (parallel) , 0.0002069 secs]2021-08-15T23:14:59.831+0800: [weak refs processing, 0.0000070 secs]2021-08-15T23:14:59.831+0800: [class unloading, 0.0001886 secs]2021-08-15T23:14:59.832+0800: [scrub symbol table, 0.0002824 secs]2021-08-15T23:14:59.832+0800: [scrub string table, 0.0000814 secs][1 CMS-remark: 342895K(349568K)] 357636K(506816K), 0.0008010 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.832+0800: [CMS-concurrent-sweep-start]
2021-08-15T23:14:59.832+0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.832+0800: [CMS-concurrent-reset-start]
2021-08-15T23:14:59.833+0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.844+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.844+0800: [ParNew: 139776K->139776K(157248K), 0.0000134 secs]2021-08-15T23:14:59.844+0800: [CMS: 342428K->348674K(349568K), 0.0434111 secs] 482204K->348674K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0434671 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
2021-08-15T23:14:59.888+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 348674K(349568K)] 352102K(506816K), 0.0004332 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.889+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.890+0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.890+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.891+0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.891+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.891+0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.891+0800: [GC (CMS Final Remark) [YG occupancy: 17894 K (157248 K)]2021-08-15T23:14:59.891+0800: [Rescan (parallel) , 0.0005217 secs]2021-08-15T23:14:59.891+0800: [weak refs processing, 0.0000087 secs]2021-08-15T23:14:59.891+0800: [class unloading, 0.0002040 secs]2021-08-15T23:14:59.891+0800: [scrub symbol table, 0.0003196 secs]2021-08-15T23:14:59.892+0800: [scrub string table, 0.0000871 secs][1 CMS-remark: 348674K(349568K)] 366568K(506816K), 0.0011887 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.892+0800: [CMS-concurrent-sweep-start]
2021-08-15T23:14:59.892+0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.893+0800: [CMS-concurrent-reset-start]
2021-08-15T23:14:59.893+0800: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.906+0800: [GC (Allocation Failure) 2021-08-15T23:14:59.906+0800: [ParNew: 139776K->139776K(157248K), 0.0000139 secs]2021-08-15T23:14:59.906+0800: [CMS: 348439K->349381K(349568K), 0.0493918 secs] 488215K->355387K(506816K), [Metaspace: 3359K->3359K(1056768K)], 0.0494600 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2021-08-15T23:14:59.955+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349381K(349568K)] 355694K(506816K), 0.0001159 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.955+0800: [CMS-concurrent-mark-start]
2021-08-15T23:14:59.957+0800: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.957+0800: [CMS-concurrent-preclean-start]
2021-08-15T23:14:59.959+0800: [CMS-concurrent-preclean: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.959+0800: [CMS-concurrent-abortable-preclean-start]
2021-08-15T23:14:59.959+0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.959+0800: [GC (CMS Final Remark) [YG occupancy: 20077 K (157248 K)]2021-08-15T23:14:59.959+0800: [Rescan (parallel) , 0.0003755 secs]2021-08-15T23:14:59.960+0800: [weak refs processing, 0.0000114 secs]2021-08-15T23:14:59.960+0800: [class unloading, 0.0003486 secs]2021-08-15T23:14:59.960+0800: [scrub symbol table, 0.0005250 secs]2021-08-15T23:14:59.960+0800: [scrub string table, 0.0001369 secs][1 CMS-remark: 349381K(349568K)] 369459K(506816K), 0.0014560 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.961+0800: [CMS-concurrent-sweep-start]
2021-08-15T23:14:59.961+0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:14:59.961+0800: [CMS-concurrent-reset-start]
2021-08-15T23:14:59.962+0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
执行结束!共生成对象次数:12594
Heap
 par new generation   total 157248K, used 117848K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
  eden space 139776K,  84% used [0x00000000e0000000, 0x00000000e7316000, 0x00000000e8880000)
  from space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
  to   space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
 concurrent mark-sweep generation total 349568K, used 349381K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
 Metaspace       used 3777K, capacity 4540K, committed 4864K, reserved 1056768K
  class space    used 422K, capacity 428K, committed 512K, reserved 1048576K
```

### 分析
从日志可以看出来，CMS使用了并行的GC方式，包含了:
1. Initial Mark
2. Concurrent Mark
3. Concurrent Preclean
4. Final Remark
5. Concurrent Sweep
6. Concurrent Reset


## 并行GC: Parallel GC + Parallel Old GC
## VM 参数
> -Xmx512m -Xms512m -XX:+UseParallelGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps

## GC日志
```
2021-08-15T23:29:02.446+0800: [GC (Allocation Failure) [PSYoungGen: 131584K->21503K(153088K)] 131584K->42572K(502784K), 0.0122518 secs] [Times: user=0.00 sys=0.09, real=0.01 secs] 
2021-08-15T23:29:02.474+0800: [GC (Allocation Failure) [PSYoungGen: 153087K->21497K(153088K)] 174156K->82675K(502784K), 0.0097633 secs] [Times: user=0.02 sys=0.08, real=0.01 secs] 
2021-08-15T23:29:02.500+0800: [GC (Allocation Failure) [PSYoungGen: 153081K->21488K(153088K)] 214259K->125190K(502784K), 0.0092987 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:29:02.525+0800: [GC (Allocation Failure) [PSYoungGen: 153072K->21489K(153088K)] 256774K->171066K(502784K), 0.0094892 secs] [Times: user=0.06 sys=0.00, real=0.01 secs] 
2021-08-15T23:29:02.549+0800: [GC (Allocation Failure) [PSYoungGen: 153073K->21494K(153088K)] 302650K->212798K(502784K), 0.0100406 secs] [Times: user=0.00 sys=0.09, real=0.01 secs] 
2021-08-15T23:29:02.571+0800: [GC (Allocation Failure) [PSYoungGen: 153078K->21503K(80384K)] 344382K->254997K(430080K), 0.0090348 secs] [Times: user=0.11 sys=0.00, real=0.01 secs] 
2021-08-15T23:29:02.586+0800: [GC (Allocation Failure) [PSYoungGen: 80383K->32577K(116736K)] 313877K->269604K(466432K), 0.0040478 secs] [Times: user=0.11 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.597+0800: [GC (Allocation Failure) [PSYoungGen: 91148K->41503K(116736K)] 328176K->285683K(466432K), 0.0061701 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:29:02.610+0800: [GC (Allocation Failure) [PSYoungGen: 99897K->53175K(116736K)] 344077K->303505K(466432K), 0.0062067 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:29:02.623+0800: [GC (Allocation Failure) [PSYoungGen: 112055K->44437K(116736K)] 362385K->325067K(466432K), 0.0094775 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:29:02.639+0800: [GC (Allocation Failure) [PSYoungGen: 103317K->17902K(116736K)] 383947K->340931K(466432K), 0.0098269 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:29:02.649+0800: [Full GC (Ergonomics) [PSYoungGen: 17902K->0K(116736K)] [ParOldGen: 323029K->237322K(349696K)] 340931K->237322K(466432K), [Metaspace: 3359K->3359K(1056768K)], 0.0254184 secs] [Times: user=0.19 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:02.681+0800: [GC (Allocation Failure) [PSYoungGen: 58880K->18261K(116736K)] 296202K->255583K(466432K), 0.0019868 secs] [Times: user=0.09 sys=0.02, real=0.00 secs] 
2021-08-15T23:29:02.688+0800: [GC (Allocation Failure) [PSYoungGen: 76875K->19350K(116736K)] 314197K->274339K(466432K), 0.0035651 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.698+0800: [GC (Allocation Failure) [PSYoungGen: 77823K->18162K(116736K)] 332812K->291348K(466432K), 0.0035961 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.708+0800: [GC (Allocation Failure) [PSYoungGen: 76539K->20998K(116736K)] 349724K->311459K(466432K), 0.0035545 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.717+0800: [GC (Allocation Failure) [PSYoungGen: 79462K->23960K(116736K)] 369923K->334497K(466432K), 0.0043821 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.722+0800: [Full GC (Ergonomics) [PSYoungGen: 23960K->0K(116736K)] [ParOldGen: 310537K->275881K(349696K)] 334497K->275881K(466432K), [Metaspace: 3359K->3359K(1056768K)], 0.0257858 secs] [Times: user=0.20 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:02.752+0800: [GC (Allocation Failure) [PSYoungGen: 58821K->21860K(116736K)] 334703K->297742K(466432K), 0.0020880 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.760+0800: [GC (Allocation Failure) [PSYoungGen: 80740K->15400K(116736K)] 356622K->312240K(466432K), 0.0036412 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.770+0800: [GC (Allocation Failure) [PSYoungGen: 74280K->16473K(116736K)] 371120K->327912K(466432K), 0.0036754 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.774+0800: [Full GC (Ergonomics) [PSYoungGen: 16473K->0K(116736K)] [ParOldGen: 311439K->288309K(349696K)] 327912K->288309K(466432K), [Metaspace: 3359K->3359K(1056768K)], 0.0275412 secs] [Times: user=0.11 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:02.807+0800: [GC (Allocation Failure) [PSYoungGen: 58764K->19199K(116736K)] 347074K->307509K(466432K), 0.0019804 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.816+0800: [GC (Allocation Failure) [PSYoungGen: 78079K->17175K(116736K)] 366389K->324017K(466432K), 0.0033613 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.825+0800: [GC (Allocation Failure) [PSYoungGen: 76055K->21200K(116736K)] 382897K->344133K(466432K), 0.0035676 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.829+0800: [Full GC (Ergonomics) [PSYoungGen: 21200K->0K(116736K)] [ParOldGen: 322932K->297171K(349696K)] 344133K->297171K(466432K), [Metaspace: 3359K->3359K(1056768K)], 0.0315433 secs] [Times: user=0.20 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:02.868+0800: [GC (Allocation Failure) [PSYoungGen: 58880K->18732K(116736K)] 356051K->315903K(466432K), 0.0020733 secs] [Times: user=0.11 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.877+0800: [GC (Allocation Failure) [PSYoungGen: 77612K->22595K(116736K)] 374783K->337048K(466432K), 0.0040012 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.881+0800: [Full GC (Ergonomics) [PSYoungGen: 22595K->0K(116736K)] [ParOldGen: 314452K->306410K(349696K)] 337048K->306410K(466432K), [Metaspace: 3359K->3359K(1056768K)], 0.0301653 secs] [Times: user=0.16 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:02.917+0800: [GC (Allocation Failure) [PSYoungGen: 58880K->19447K(116736K)] 365290K->325857K(466432K), 0.0018687 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.925+0800: [GC (Allocation Failure) [PSYoungGen: 78327K->20892K(116736K)] 384737K->346266K(466432K), 0.0040562 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.929+0800: [Full GC (Ergonomics) [PSYoungGen: 20892K->0K(116736K)] [ParOldGen: 325373K->311996K(349696K)] 346266K->311996K(466432K), [Metaspace: 3359K->3359K(1056768K)], 0.0289089 secs] [Times: user=0.20 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:02.964+0800: [GC (Allocation Failure) [PSYoungGen: 58830K->22579K(116736K)] 370826K->334575K(466432K), 0.0023072 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.972+0800: [GC (Allocation Failure) [PSYoungGen: 81249K->45312K(116224K)] 393246K->357309K(465920K), 0.0041530 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:29:02.980+0800: [GC (Allocation Failure) --[PSYoungGen: 104192K->104192K(116224K)] 416189K->453861K(465920K), 0.0070504 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2021-08-15T23:29:02.990+0800: [Full GC (Ergonomics) [PSYoungGen: 104192K->0K(116224K)] [ParOldGen: 349669K->325159K(349696K)] 453861K->325159K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0319617 secs] [Times: user=0.23 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.029+0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116224K)] [ParOldGen: 325159K->326984K(349696K)] 384039K->326984K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0313613 secs] [Times: user=0.20 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.068+0800: [Full GC (Ergonomics) [PSYoungGen: 58548K->0K(116224K)] [ParOldGen: 326984K->329121K(349696K)] 385532K->329121K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0333665 secs] [Times: user=0.22 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.107+0800: [Full GC (Ergonomics) [PSYoungGen: 58842K->0K(116224K)] [ParOldGen: 329121K->331181K(349696K)] 387963K->331181K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0326489 secs] [Times: user=0.25 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.145+0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116224K)] [ParOldGen: 331181K->327814K(349696K)] 390061K->327814K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0314714 secs] [Times: user=0.20 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.182+0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116224K)] [ParOldGen: 327814K->331524K(349696K)] 386694K->331524K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0311995 secs] [Times: user=0.13 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.219+0800: [Full GC (Ergonomics) [PSYoungGen: 58531K->0K(116224K)] [ParOldGen: 331524K->331615K(349696K)] 390056K->331615K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0317430 secs] [Times: user=0.14 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.256+0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116224K)] [ParOldGen: 331615K->335336K(349696K)] 390495K->335336K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0316756 secs] [Times: user=0.22 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.294+0800: [Full GC (Ergonomics) [PSYoungGen: 58844K->0K(116224K)] [ParOldGen: 335336K->338824K(349696K)] 394180K->338824K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0315599 secs] [Times: user=0.19 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.333+0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116224K)] [ParOldGen: 338824K->334042K(349696K)] 397704K->334042K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0320055 secs] [Times: user=0.17 sys=0.00, real=0.03 secs] 
2021-08-15T23:29:03.370+0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116224K)] [ParOldGen: 334042K->335771K(349696K)] 392922K->335771K(465920K), [Metaspace: 3359K->3359K(1056768K)], 0.0333231 secs] [Times: user=0.19 sys=0.00, real=0.03 secs] 
执行结束!共生成对象次数:10354
Heap
 PSYoungGen      total 116224K, used 4167K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
  eden space 58880K, 7% used [0x00000000f5580000,0x00000000f5991ea8,0x00000000f8f00000)
  from space 57344K, 0% used [0x00000000fc800000,0x00000000fc800000,0x0000000100000000)
  to   space 57856K, 0% used [0x00000000f8f00000,0x00000000f8f00000,0x00000000fc780000)
 ParOldGen       total 349696K, used 335771K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
  object space 349696K, 96% used [0x00000000e0000000,0x00000000f47e6ec8,0x00000000f5580000)
 Metaspace       used 3378K, capacity 4500K, committed 4864K, reserved 1056768K
  class space    used 370K, capacity 388K, committed 512K, reserved 1048576K
```

### 分析
年轻代使用`标记-复制`算法，老年代使用`标记-清除-整理`算法，可以通过`-XX：ParallelGCThreads`来指定GC线程数，提高GC的并发度。并行GC在多核环境中使用，
主要是为了提高系统的吞吐量，多核并行进行GC，总的STW时间缩短了，在GC的周期内没有时间间隔，提高了GC效率。

## G1 GC
### VM 参数
> -Xmx512m -Xms512m -XX:+UseG1GC -XX:+PrintGCDetails -XX:+PrintGCDateStamps

### GC日志
```
2021-08-15T23:34:36.017+0800: [GC pause (G1 Evacuation Pause) (young), 0.0023417 secs]
   [Parallel Time: 1.7 ms, GC Workers: 8]
      [GC Worker Start (ms): Min: 142.7, Avg: 142.7, Max: 142.8, Diff: 0.1]
      [Ext Root Scanning (ms): Min: 0.1, Avg: 0.3, Max: 1.6, Diff: 1.5, Sum: 2.6]
      [Update RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
         [Processed Buffers: Min: 0, Avg: 0.0, Max: 0, Diff: 0, Sum: 0]
      [Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [Code Root Scanning (ms): Min: 0.0, Avg: 0.0, Max: 0.1, Diff: 0.1, Sum: 0.1]
      [Object Copy (ms): Min: 0.0, Avg: 1.2, Max: 1.4, Diff: 1.4, Sum: 9.5]
      [Termination (ms): Min: 0.0, Avg: 0.1, Max: 0.3, Diff: 0.3, Sum: 0.6]
         [Termination Attempts: Min: 4, Avg: 15.9, Max: 22, Diff: 18, Sum: 127]
      [GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.2]
      [GC Worker Total (ms): Min: 1.6, Avg: 1.6, Max: 1.7, Diff: 0.1, Sum: 13.0]
      [GC Worker End (ms): Min: 144.3, Avg: 144.3, Max: 144.3, Diff: 0.0]
   [Code Root Fixup: 0.0 ms]
   [Code Root Purge: 0.0 ms]
   [Clear CT: 0.1 ms]
   [Other: 0.5 ms]
      [Choose CSet: 0.0 ms]
      [Ref Proc: 0.1 ms]
      [Ref Enq: 0.0 ms]
      [Redirty Cards: 0.2 ms]
      [Humongous Register: 0.0 ms]
      [Humongous Reclaim: 0.0 ms]
      [Free CSet: 0.0 ms]
   [Eden: 25.0M(25.0M)->0.0B(21.0M) Survivors: 0.0B->4096.0K Heap: 36.5M(512.0M)->12.4M(512.0M)]
 [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:34:36.023+0800: [GC pause (G1 Evacuation Pause) (young), 0.0014832 secs]
   [Parallel Time: 1.1 ms, GC Workers: 8]
      [GC Worker Start (ms): Min: 149.3, Avg: 149.5, Max: 150.3, Diff: 1.0]
      [Ext Root Scanning (ms): Min: 0.0, Avg: 0.1, Max: 0.1, Diff: 0.1, Sum: 0.7]
      [Update RS (ms): Min: 0.0, Avg: 0.1, Max: 0.2, Diff: 0.2, Sum: 0.6]
         [Processed Buffers: Min: 0, Avg: 1.1, Max: 3, Diff: 3, Sum: 9]
      [Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [Code Root Scanning (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [Object Copy (ms): Min: 0.0, Avg: 0.6, Max: 0.8, Diff: 0.8, Sum: 5.1]
      [Termination (ms): Min: 0.0, Avg: 0.0, Max: 0.1, Diff: 0.1, Sum: 0.3]
         [Termination Attempts: Min: 1, Avg: 1.0, Max: 1, Diff: 0, Sum: 8]
      [GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [GC Worker Total (ms): Min: 0.0, Avg: 0.8, Max: 1.0, Diff: 1.0, Sum: 6.7]
      [GC Worker End (ms): Min: 150.3, Avg: 150.3, Max: 150.4, Diff: 0.0]
   [Code Root Fixup: 0.0 ms]
   [Code Root Purge: 0.0 ms]
   [Clear CT: 0.1 ms]
   [Other: 0.3 ms]
      [Choose CSet: 0.0 ms]
      [Ref Proc: 0.1 ms]
      [Ref Enq: 0.0 ms]
      [Redirty Cards: 0.1 ms]
      [Humongous Register: 0.0 ms]
      [Humongous Reclaim: 0.0 ms]
      [Free CSet: 0.0 ms]
   [Eden: 21.0M(21.0M)->0.0B(39.0M) Survivors: 4096.0K->4096.0K Heap: 38.5M(512.0M)->18.8M(512.0M)]
 [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:34:36.035+0800: [GC pause (G1 Evacuation Pause) (young), 0.0022741 secs]
   [Parallel Time: 1.9 ms, GC Workers: 8]
      [GC Worker Start (ms): Min: 160.9, Avg: 161.0, Max: 161.3, Diff: 0.4]
      [Ext Root Scanning (ms): Min: 0.0, Avg: 0.1, Max: 0.1, Diff: 0.1, Sum: 0.6]
      [Update RS (ms): Min: 0.0, Avg: 0.2, Max: 1.2, Diff: 1.2, Sum: 1.4]
         [Processed Buffers: Min: 0, Avg: 1.0, Max: 2, Diff: 2, Sum: 8]
      [Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [Code Root Scanning (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [Object Copy (ms): Min: 0.4, Avg: 1.3, Max: 1.6, Diff: 1.2, Sum: 10.6]
      [Termination (ms): Min: 0.0, Avg: 0.1, Max: 0.1, Diff: 0.1, Sum: 0.6]
         [Termination Attempts: Min: 1, Avg: 1.0, Max: 1, Diff: 0, Sum: 8]
      [GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.1]
      [GC Worker Total (ms): Min: 1.4, Avg: 1.7, Max: 1.8, Diff: 0.4, Sum: 13.3]
      [GC Worker End (ms): Min: 162.6, Avg: 162.6, Max: 162.6, Diff: 0.0]
   [Code Root Fixup: 0.0 ms]
   [Code Root Purge: 0.0 ms]
   [Clear CT: 0.1 ms]
   [Other: 0.3 ms]
      [Choose CSet: 0.0 ms]
      [Ref Proc: 0.1 ms]
      [Ref Enq: 0.0 ms]
      [Redirty Cards: 0.0 ms]
      [Humongous Register: 0.0 ms]
      [Humongous Reclaim: 0.0 ms]
      [Free CSet: 0.0 ms]
   [Eden: 39.0M(39.0M)->0.0B(81.0M) Survivors: 4096.0K->6144.0K Heap: 63.8M(512.0M)->32.3M(512.0M)]
 [Times: user=0.00 sys=0.00, real=0.00 secs] 
2021-08-15T23:34:36.069+0800: [GC pause (G1 Evacuation Pause) (young), 0.0047793 secs]
   [Parallel Time: 4.4 ms, GC Workers: 8]
      [GC Worker Start (ms): Min: 194.4, Avg: 194.5, Max: 194.6, Diff: 0.1]
      [Ext Root Scanning (ms): Min: 0.0, Avg: 0.1, Max: 0.1, Diff: 0.1, Sum: 0.7]
      [Update RS (ms): Min: 0.3, Avg: 0.3, Max: 0.4, Diff: 0.0, Sum: 2.8]
         [Processed Buffers: Min: 7, Avg: 7.0, Max: 7, Diff: 0, Sum: 56]
      [Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [Code Root Scanning (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [Object Copy (ms): Min: 3.7, Avg: 3.8, Max: 3.8, Diff: 0.1, Sum: 30.0]
      [Termination (ms): Min: 0.0, Avg: 0.1, Max: 0.1, Diff: 0.1, Sum: 0.5]
         [Termination Attempts: Min: 1, Avg: 1.0, Max: 1, Diff: 0, Sum: 8]
      [GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.1]
      [GC Worker Total (ms): Min: 4.2, Avg: 4.3, Max: 4.3, Diff: 0.1, Sum: 34.2]
      [GC Worker End (ms): Min: 198.8, Avg: 198.8, Max: 198.8, Diff: 0.0]
   [Code Root Fixup: 0.0 ms]
   [Code Root Purge: 0.0 ms]
   [Clear CT: 0.1 ms]
   [Other: 0.3 ms]
      [Choose CSet: 0.0 ms]
      [Ref Proc: 0.1 ms]
      [Ref Enq: 0.0 ms]
      [Redirty Cards: 0.1 ms]
      [Humongous Register: 0.0 ms]
      [Humongous Reclaim: 0.0 ms]
      [Free CSet: 0.0 ms]
   [Eden: 81.0M(81.0M)->0.0B(79.0M) Survivors: 6144.0K->11.0M Heap: 139.1M(512.0M)->67.1M(512.0M)]
 [Times: user=0.00 sys=0.13, real=0.00 secs] 
```

### 分析
G1 GC的日志非常多，也非常复杂，难以分析。因为G1 GC在内存区域的划分上发生了明显的改变。通过把内存区域分成多个Region区域，在这些区域上可以灵活地指定Eden区、
Survivor区和老年代Old区，这样划分的好处是，G1每次进行GC的时候可以只处理一小部分区域，而不是处理全部的区域，这样效率更高。

G1还有一个特点是可以控制每次垃圾回收的时长，参数`-XX：MaxGCPauseMills`可以设置一个数值，默认是200ms，设置后G1会逐步将自己的GC时间调整到这个数值上。
但是这个数值要谨慎使用，因为它可能会影响工作线程的执行，影响吞吐量。
