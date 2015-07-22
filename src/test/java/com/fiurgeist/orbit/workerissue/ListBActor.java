package com.fiurgeist.orbit.workerissue;

import java.util.List;

import com.ea.orbit.actors.Actor;
import com.ea.orbit.actors.annotation.StatelessWorker;
import com.ea.orbit.concurrent.Task;

@StatelessWorker
public interface ListBActor extends Actor {
	Task<Void> addAll(List<String> ids);
}
