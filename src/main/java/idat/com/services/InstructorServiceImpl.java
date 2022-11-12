package idat.com.services;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.interfaz.InstructorRepository;
import idat.com.interfazservices.InstructorService;
import idat.com.modelo.Instructor02;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorRepository repository;
	
	
	@Override
	@Transactional(readOnly=true)
	public Collection<Instructor02> findAll() {
		return (Collection<Instructor02>)repository.findAll();
	}

}
