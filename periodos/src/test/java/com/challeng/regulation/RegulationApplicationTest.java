package com.challeng.regulation;



import com.challenge.regulation.model.Period;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegulationApplicationTest {

 public Period getPeridMock() {
        Period period = new Period();
        period.setId(1L);
        String initialDate = "1997-11-01";
        period.setFechaCreacion(LocalDate.parse(initialDate));
        String finalDate = "2015-09-01";
        period.setFechaFin(LocalDate.parse(finalDate));

        List<LocalDate> periods = new ArrayList<LocalDate>();
        // Initial Periods cancelled
        periods.add(LocalDate.parse("1998-02-01"));
        periods.add(LocalDate.parse("1998-06-01"));
        periods.add(LocalDate.parse("1998-08-01"));
        periods.add(LocalDate.parse("1998-11-01"));
        periods.add(LocalDate.parse("1999-02-01"));
        periods.add(LocalDate.parse("1999-05-01"));
        periods.add(LocalDate.parse("1999-07-01"));
        periods.add(LocalDate.parse("1999-09-01"));
        periods.add(LocalDate.parse("1999-10-01"));
        periods.add(LocalDate.parse("1999-11-01"));
        periods.add(LocalDate.parse("2000-01-01"));
        periods.add(LocalDate.parse("2000-02-01"));
        periods.add(LocalDate.parse("2000-04-01"));
        periods.add(LocalDate.parse("2000-05-01"));
        periods.add(LocalDate.parse("2000-07-01"));
        periods.add(LocalDate.parse("2000-09-01"));
        periods.add(LocalDate.parse("2000-12-01"));
        periods.add(LocalDate.parse("2001-06-01"));
        periods.add(LocalDate.parse("2001-07-01"));
        periods.add(LocalDate.parse("2002-01-01"));
        periods.add(LocalDate.parse("2002-08-01"));
        periods.add(LocalDate.parse("2002-11-01"));
        periods.add(LocalDate.parse("2002-12-01"));
        periods.add(LocalDate.parse("2003-02-01"));
        periods.add(LocalDate.parse("2003-05-01"));
        periods.add(LocalDate.parse("2003-06-01"));
        periods.add(LocalDate.parse("2003-11-01"));
        periods.add(LocalDate.parse("2003-12-01"));
        periods.add(LocalDate.parse("2004-02-01"));
        periods.add(LocalDate.parse("2004-04-01"));
        periods.add(LocalDate.parse("2004-05-01"));
        periods.add(LocalDate.parse("2004-08-01"));
        periods.add(LocalDate.parse("2005-02-01"));
        periods.add(LocalDate.parse("2005-03-01"));
        periods.add(LocalDate.parse("2005-06-01"));
        periods.add(LocalDate.parse("2005-07-01"));
        periods.add(LocalDate.parse("2005-08-01"));
        periods.add(LocalDate.parse("2005-11-01"));
        periods.add(LocalDate.parse("2005-12-01"));
        periods.add(LocalDate.parse("2006-02-01"));
        periods.add(LocalDate.parse("2006-03-01"));
        periods.add(LocalDate.parse("2006-05-01"));
        periods.add(LocalDate.parse("2006-07-01"));
        periods.add(LocalDate.parse("2006-08-01"));
        periods.add(LocalDate.parse("2006-10-01"));
        periods.add(LocalDate.parse("2006-12-01"));
        periods.add(LocalDate.parse("2007-01-01"));
        periods.add(LocalDate.parse("2007-11-01"));
        periods.add(LocalDate.parse("2007-12-01"));
        periods.add(LocalDate.parse("2008-02-01"));
        periods.add(LocalDate.parse("2008-03-01"));
        periods.add(LocalDate.parse("2008-07-01"));
        periods.add(LocalDate.parse("2008-08-01"));
        periods.add(LocalDate.parse("2008-09-01"));
        periods.add(LocalDate.parse("2008-10-01"));
        periods.add(LocalDate.parse("2008-12-01"));
        periods.add(LocalDate.parse("2009-01-01"));
        periods.add(LocalDate.parse("2009-05-01"));
        periods.add(LocalDate.parse("2009-07-01"));
        periods.add(LocalDate.parse("2009-08-01"));
        periods.add(LocalDate.parse("2009-10-01"));
        periods.add(LocalDate.parse("2009-11-01"));
        periods.add(LocalDate.parse("2009-12-01"));
        periods.add(LocalDate.parse("2010-01-01"));
        periods.add(LocalDate.parse("2010-03-01"));
        periods.add(LocalDate.parse("2010-09-01"));
        periods.add(LocalDate.parse("2011-02-01"));
        periods.add(LocalDate.parse("2011-03-01"));
        periods.add(LocalDate.parse("2011-04-01"));
        periods.add(LocalDate.parse("2011-05-01"));
        periods.add(LocalDate.parse("2011-06-01"));
        periods.add(LocalDate.parse("2011-07-01"));
        periods.add(LocalDate.parse("2011-10-01"));
        periods.add(LocalDate.parse("2011-12-01"));
        periods.add(LocalDate.parse("2012-01-01"));
        periods.add(LocalDate.parse("2012-04-01"));
        periods.add(LocalDate.parse("2012-05-01"));
        periods.add(LocalDate.parse("2012-06-01"));
        periods.add(LocalDate.parse("2012-07-01"));
        periods.add(LocalDate.parse("2012-09-01"));
        periods.add(LocalDate.parse("2012-11-01"));
        periods.add(LocalDate.parse("2013-04-01"));
        periods.add(LocalDate.parse("2013-06-01"));
        periods.add(LocalDate.parse("2013-11-01"));
        periods.add(LocalDate.parse("2014-01-01"));
        periods.add(LocalDate.parse("2014-04-01"));
        periods.add(LocalDate.parse("2014-05-01"));
        periods.add(LocalDate.parse("2014-07-01"));
        periods.add(LocalDate.parse("2014-08-01"));
        periods.add(LocalDate.parse("2014-11-01"));
        periods.add(LocalDate.parse("2015-03-01"));
        periods.add(LocalDate.parse("2015-04-01"));
        periods.add(LocalDate.parse("2015-06-01"));
        periods.add(LocalDate.parse("2015-08-01"));
        // End Periods cancelled

        period.setFechas(periods);
        return period;
    }
}
