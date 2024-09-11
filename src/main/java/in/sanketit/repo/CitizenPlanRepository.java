package in.sanketit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.sanketit.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer> {

	@Query("select distinct(PlanName) from CitizenPlan")
	public List<CitizenPlan> getPlannames();

	@Query("select distinct(PlanStatus) from CitizenPlan")
	public List<CitizenPlan> getPlanStatus();

}
