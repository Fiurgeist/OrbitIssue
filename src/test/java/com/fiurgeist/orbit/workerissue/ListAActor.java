package com.fiurgeist.orbit.workerissue;

import com.ea.orbit.actors.Actor;
import com.ea.orbit.actors.annotation.StatelessWorker;
import com.ea.orbit.concurrent.Task;

@StatelessWorker
public interface ListAActor extends Actor {
	Task<Void> add(String id);
}
