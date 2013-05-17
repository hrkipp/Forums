package forums.actions;

import forums.actions.home.LoadCategories;

public enum Actions {

	Load_Categories(LoadCategories.class);

	private Actions(Class clazz){
		this.clazz = clazz;
	}

	private Class clazz;

	public Class getAction(){
		return clazz;
	}




}
