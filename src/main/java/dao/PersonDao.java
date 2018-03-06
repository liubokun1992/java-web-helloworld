package dao;

public class PersonDao implements IPersonDao{

	@Override
	public void save() {
		System.out.println("=========PersonDao save()==========");
	}

}
