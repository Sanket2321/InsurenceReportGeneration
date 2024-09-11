package in.sanketit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "CITIZEN_PLAN_INFO")
public class CitizenPlan {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer CitizenId;
	private String CitizenName;
	private String Geneder;
	private String PlanName;
	private String PlanStatus;
	private LocalDate PlanStartDate;
	private LocalDate PlanEndDate;
	private Double Benefit_Amount;
	private String Denial_Reason;
	private LocalDate TerminatedDate;
	private String TerminationReason;
	public Integer getCitizenId() {
		return CitizenId;
	}
	public void setCitizenId(Integer citizenId) {
		CitizenId = citizenId;
	}
	public String getCitizenName() {
		return CitizenName;
	}
	public void setCitizenName(String citizenName) {
		CitizenName = citizenName;
	}
	public String getGeneder() {
		return Geneder;
	}
	public void setGeneder(String geneder) {
		Geneder = geneder;
	}
	public String getPlanName() {
		return PlanName;
	}
	public void setPlanName(String planName) {
		PlanName = planName;
	}
	public String getPlanStatus() {
		return PlanStatus;
	}
	public void setPlanStatus(String planStatus) {
		PlanStatus = planStatus;
	}
	public LocalDate getPlanStartDate() {
		return PlanStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		PlanStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return PlanEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		PlanEndDate = planEndDate;
	}
	public Double getBenefit_Amount() {
		return Benefit_Amount;
	}
	public void setBenefit_Amount(Double benefit_Amount) {
		Benefit_Amount = benefit_Amount;
	}
	public String getDenial_Reason() {
		return Denial_Reason;
	}
	public void setDenial_Reason(String denial_Reason) {
		Denial_Reason = denial_Reason;
	}
	public LocalDate getTerminatedDate() {
		return TerminatedDate;
	}
	public void setTerminatedDate(LocalDate terminatedDate) {
		TerminatedDate = terminatedDate;
	}
	public String getTerminationReason() {
		return TerminationReason;
	}
	public void setTerminationReason(String terminationReason) {
		TerminationReason = terminationReason;
	}
	
	

}
