package com.fiurgeist.orbit.workerissue;

import java.util.LinkedList;
import java.util.List;

import com.ea.orbit.actors.Actor;
import com.ea.orbit.actors.runtime.AbstractActor;
import com.ea.orbit.concurrent.Task;

@SuppressWarnings("rawtypes")
public class ListAActorImpl extends AbstractActor implements ListAActor {
	public final List<String> list = new LinkedList<>();
	
	private Task sendData() {
		if(list.size() >= 4){
			System.out.println("ListAActorImpl sendData " + System.identityHashCode(this) + " ; size: " + list.size());
			Actor.getReference(ListBActor.class, "listB").addAll(list);
			list.clear();
		}
		return Task.done();
	}
	
	@Override
	public Task<Void> add(String id) {
		list.add(id);
		System.out.println("add to ListAActorImpl " + System.identityHashCode(this) + " ; size: " + list.size());
		sendData();
		return Task.done();
	}
}
