package com.fiurgeist.orbit.workerissue;

import java.util.LinkedList;
import java.util.List;

import com.ea.orbit.actors.runtime.AbstractActor;
import com.ea.orbit.concurrent.Task;

@SuppressWarnings("rawtypes")
public class ListBActorImpl extends AbstractActor implements ListBActor {
	public final List<String> list = new LinkedList<>();
	
	@Override
	public Task<Void> addAll(List<String> ids) {
		list.addAll(ids);
		System.out.println("addAll to ListBActorImpl "+System.identityHashCode(this) +" ; size: "+list.size());
		return Task.done();
	}
}
