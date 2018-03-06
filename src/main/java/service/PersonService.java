package service;

import dao.IPersonDao;

public class PersonService implements IPersonService{
	
	private IPersonDao personDao = null; 

	@Override
	public void processSave() {
		System.out.println("=========PersonService.processSave()==========");
		personDao.save();
	}

	public IPersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}

}
