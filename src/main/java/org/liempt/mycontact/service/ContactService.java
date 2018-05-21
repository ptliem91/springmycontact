/**
 * 
 */
package org.liempt.mycontact.service;

import java.util.List;
import java.util.Optional;

import org.liempt.mycontact.model.Contact;

/**
 * @author liempt
 *
 */
public interface ContactService {
	
	Iterable<Contact> findAll();

	List<Contact> search(String q);

	Optional<Contact> findOne(int id);

	void save(Contact contact);

	void delete(int id);
}
