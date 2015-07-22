# Orbit Issue
===================

## worker issue

see /src/test/java/com/fiurgeist/orbit/workerissue
There you can find a unit test which doesn't make a lot of sense as it is because I streamlined it to focus on the issue.
It's basically just a for loop which calls a StatelessWorker a 100 times and in that actor another StatelessWorker is called.
And every 10th or so run of the test I get this exception:
`
Jul 22, 2015 5:06:12 PM com.ea.orbit.concurrent.ExecutorUtils lambda$newScalingThreadPool$0
Uncaught Exception
java.lang.Error: Error loading class: null
    at com.ea.orbit.actors.runtime.Execution.classForName(Execution.java:776)
    at com.ea.orbit.actors.runtime.Execution.classForName(Execution.java:762)
    at com.ea.orbit.actors.runtime.Execution.access$300(Execution.java:93)
    at com.ea.orbit.actors.runtime.Execution$Activation.getOrCreateInstance(Execution.java:432)
    at com.ea.orbit.actors.runtime.Execution.executeMessage(Execution.java:989)
    at com.ea.orbit.actors.runtime.Execution.lambda$handleOnMessageReceived$24(Execution.java:912)
    at com.ea.orbit.actors.runtime.Execution$$Lambda$55/2071701248.get(Unknown Source)
    at com.ea.orbit.actors.runtime.ExecutionSerializer.lambda$offerJob$32(ExecutionSerializer.java:116)
    at com.ea.orbit.actors.runtime.ExecutionSerializer$$Lambda$56/619859981.run(Unknown Source)
    at java.util.concurrent.ForkJoinTask$RunnableExecuteAction.exec(Unknown Source)
    at java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
    at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(Unknown Source)
    at java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
    at java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)
Caused by: java.lang.NullPointerException
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Unknown Source)
    at com.ea.orbit.actors.runtime.Execution.classForName(Execution.java:770)
    ... 13 more
`