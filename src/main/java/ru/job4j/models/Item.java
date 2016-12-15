package ru.job4j.models;

/**
 * Класс деталь.
 * @author Vladimir
 */
public class Item {

	/**
	 * Название.
	 */
	protected String name;
	/**
	 * Описание.
	 */
	protected String description;
	/**
	 * Время создания.
	 */
	private long create;
	/**
	 * Комментарии.
	 */
	private String[] comment;
	/**
	 * Уникальный ключ.
	 */
	private String id;

	/**
	 * Конструктор пустой.
	 */
	public Item (){
	}

	/**
	 * Конструктор.
	 * @param name
	 * @param description
	 * @param create
	 */
	public Item (String name, String description, long create) {
		this.name = name;
		this.description = description;
		this.create = create;
	}

	/**
	 * Setter.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter..
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Setter.
	 * @param create
	 */
	public void setCreate(long create) {
		this.create = create;
	}	

	/**
	 * Setter.
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Setter.
	 * @param comment
	 */
	public void setComment(String[] comment) {
		this.comment = comment;
	}

	/**
	 * Setter.
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter.
	 * @return
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Getter.
	 * @return
	 */
	public long getCreate() {
		return this.create;
	}

	/**
	 * Getter.
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * Getter.
	 * @return
	 */
	public String[] getComment() {
		return comment;
	}
}