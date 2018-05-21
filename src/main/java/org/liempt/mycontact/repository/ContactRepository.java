/**
 * 
 */
package org.liempt.mycontact.repository;

import java.util.List;

import org.liempt.mycontact.model.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * @author liempt
 *
 */
public interface ContactRepository extends CrudRepository<Contact, Integer> {

	List<Contact> findByNameContaining(String q);
}
