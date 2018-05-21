/**
 * 
 */
package org.liempt.mycontact.service;

import java.util.List;
import java.util.Optional;

import org.liempt.mycontact.model.Contact;
import org.liempt.mycontact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liempt
 *
 */
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Iterable<Contact> findAll() {
		return contactRepository.findAll();
	}

	@Override
	public List<Contact> search(String q) {
		return contactRepository.findByNameContaining(q);
	}

	@Override
	public Optional<Contact> findOne(int id) {
		return contactRepository.findById(id);
	}

	@Override
	public void save(Contact contact) {
		contactRepository.save(contact);

	}

	@Override
	public void delete(int id) {
		contactRepository.deleteById(id);

	}

}
