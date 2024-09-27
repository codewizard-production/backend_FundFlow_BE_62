package com.app.FundFlow_BE.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.FundFlow_BE.model.Stage;
import com.app.FundFlow_BE.model.Startup;
import com.app.FundFlow_BE.model.FundingRound;
import com.app.FundFlow_BE.model.Founder;
import com.app.FundFlow_BE.model.Document;
import com.app.FundFlow_BE.model.Investor;
import com.app.FundFlow_BE.enums.RoundStatus;
import com.app.FundFlow_BE.enums.StageName;
import com.app.FundFlow_BE.converter.StageNameConverter;
import com.app.FundFlow_BE.converter.RoundStatusConverter;

@Entity(name = "StartupFounders")
@Table(schema = "\"fundflow_be\"", name = "\"StartupFounders\"")
@Data
public class StartupFounders{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"SId\"")
	private Integer sId;

    
    @Column(name = "\"FId\"")
    private Integer fId;
 
}