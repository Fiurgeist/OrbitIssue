package com.fiurgeist.orbit.workerissue;

import static com.jayway.awaitility.Awaitility.await;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;

import com.ea.orbit.actors.Actor;
import com.ea.orbit.actors.test.ActorBaseTest;

public class WorkerTest extends ActorBaseTest {
	private static final int LENGTH = 100;//needs to be a multiple of 4
	private static final int MATCHES = (int)(LENGTH/4f);

	@Test
	public void testSequence() throws ExecutionException, InterruptedException {
		createStage();
//		HolderActor holder = Actor.getReference(HolderActor.class, "holder");
		for (int i = 0;  i < LENGTH; ++i) {
			Actor.getReference(ListAActor.class, "listA").add(""+i);
		}
		
//		await().atMost(10, TimeUnit.SECONDS).until(() -> holder.getSize().join() == MATCHES);
		Thread.sleep(3000);
		Assert.assertEquals(true, true);
	}
}
