package in.sanketit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.sanketit.entity.CitizenPlan;
import in.sanketit.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {
	@Autowired
	private CitizenPlanRepository citizenPlanRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//citizenPlanRepository.deleteAll();
		// cash plan data
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("sanket");
		c1.setGeneder("male");
		c1.setPlanName("cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefit_Amount(10000.00);

		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("smith");
		c2.setGeneder("male");
		c2.setPlanName("cash");
		c2.setPlanStatus("Denied");
		c2.setDenial_Reason("Rental income");

		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("sushma");
		c3.setGeneder("female");
		c3.setPlanName("cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefit_Amount(5000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationReason("Emloyeed");

		// food plan data

		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("suraj");
		c4.setGeneder("male");
		c4.setPlanName("food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefit_Amount(50000.00);

		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("David");
		c5.setGeneder("male");
		c5.setPlanName("food");
		c5.setPlanStatus("Denied");
		c5.setDenial_Reason("Property income");

		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("crishy");
		c6.setGeneder("female");
		c6.setPlanName("food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefit_Amount(5000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationReason("rent");

		// mediacal plan data
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("narayan");
		c7.setGeneder("male");
		c7.setPlanName("medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefit_Amount(4000.00);

		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("charle");
		c8.setGeneder("male");
		c8.setPlanName("medical");
		c8.setPlanStatus("Denied");
		c8.setDenial_Reason("salary income");

		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("dolly");
		c9.setGeneder("female");
		c9.setPlanName("medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefit_Amount(5000.00);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationReason("Goverment job");

		// Employment plan data
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("pravin");
		c10.setGeneder("male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefit_Amount(100000.00);

		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("sachin");
		c11.setGeneder("male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setDenial_Reason("Get Job");

		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Guccy");
		c12.setGeneder("female");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefit_Amount(4000.00);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationReason("");

		List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12);

		citizenPlanRepository.saveAll(list);

	}

}
