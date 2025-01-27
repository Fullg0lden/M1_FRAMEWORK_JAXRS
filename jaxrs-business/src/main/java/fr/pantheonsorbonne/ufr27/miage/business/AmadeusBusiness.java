package fr.pantheonsorbonne.ufr27.miage.business;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import fr.pantheonsorbonne.ufr27.miage.vo.ANFlightDTO;

public interface AmadeusBusiness {

	Collection<ANFlightDTO> findFlights(String departure, String arrival, Date date);

	BigDecimal priceSegment(String flightNum, Date date, String klass, int passCount);

}