package co.simplon.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "linkType")
public class LinkType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String nameLinkType;

	@OneToMany(mappedBy = "linkType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Access> accessList;

	public LinkType() {
	}

	public LinkType(String nameLinkType) {
		this.nameLinkType = nameLinkType;
	}

	public LinkType(Long id, String nameLinkType) {
		this.id = id;
		this.nameLinkType = nameLinkType;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nameLinkType
	 */
	public String getNameLinkType() {
		return nameLinkType;
	}

	/**
	 * @param nameLinkType
	 *            the nameLinkType to set
	 */
	public void setNameLinkType(String nameLinkType) {
		this.nameLinkType = nameLinkType;
	}

	/**
	 * @return the accessList
	 */
	public List<Access> getAccessList() {
		return accessList;
	}

	/**
	 * @param accessList
	 *            the accessList to set
	 */
	public void setAccessList(List<Access> accessList) {
		this.accessList = accessList;
	}
}