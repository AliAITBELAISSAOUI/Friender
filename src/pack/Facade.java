package pack;

import java.util.Collection;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import beans.Interaction;
import beans.Messages;
import beans.Person;

@Singleton
public class Facade {
	
	
	@PersistenceContext
	private EntityManager em;

	public Person getperson(long idother) {
		// TODO Auto-generated method stub
		return null;
	}

	public Interaction getInteraction(long personID, long personID2) {
		TypedQuery<Interaction> req=em.createQuery("SELECT i FROM interaction i WHERE i.sender_personID = :senderid AND receiver_person_ID = :receiverid",Interaction.class);
		req.setParameter("senderid", personID);
		req.setParameter("receiverid", personID2);
		return req.getSingleResult();
	}

	public Collection<Messages> getMessages(long interactionID) {
		
		TypedQuery<Messages> req=em.createQuery("SELECT m FROM messages m WHERE m.MESSAGESENDER_INTERACTIONID  = :interactionId",Messages.class);
		req.setParameter("interactionID", interactionID);
		return req.getResultList();
	}

	public Collection<Interaction> getInerractions(long personID) {
		
		TypedQuery<Interaction> req=em.createQuery("SELECT i FROM interaction i WHERE i.sender_personID = :senderid",Interaction.class);
		req.setParameter("senderid", personID);
		
		Collection<Interaction> interactionlList=req.getResultList();
		
		req=em.createQuery("SELECT i FROM interaction i WHERE i.receiver_person_ID = :receiverId",Interaction.class);
		req.setParameter("receiverId", personID);
		
		interactionlList.addAll(req.getResultList());
		
		
		return interactionlList;
	}

	public Collection<Messages> getAllMessages(long personID, long personID2) {
		

		Interaction i1 = getInteraction(personID,personID2);
		Interaction i2 = getInteraction(personID2,personID);
		Collection<Messages> messages = getMessages(i1.getInteractionID());
		
		messages.addAll(getMessages(i1.getInteractionID()));
		// TODO Auto-generated method stub
		return messages;
	}
	
	
	
}
