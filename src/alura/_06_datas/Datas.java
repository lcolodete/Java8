package alura._06_datas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);

		LocalDate olimpiadasRio = LocalDate.of(2020, Month.JUNE, 5);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period period = Period.between(hoje, olimpiadasRio);
		System.out.println(period);
		
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(4));
		System.out.println(hoje.minusDays(2)); // 2 days ago
		
		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(4));
		System.out.println(hoje.plusDays(2));
		
		LocalDate tomorrow = hoje.plusDays(1);
		System.out.println(tomorrow);
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(proximasOlimpiadas.format(formatador));
		
		System.out.println( "Hoje é : " + formatador.format(hoje) );
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println(agora.format(formatadorComHoras));
		
		YearMonth anoMes = YearMonth.of(2015, Month.JANUARY);
		System.out.println(anoMes);
		
		DateTimeFormatter formatadorAnoMes = DateTimeFormatter.ofPattern("yy/MM");
		System.out.println(anoMes.format(formatadorAnoMes));
		
		LocalTime horarioAlmoco = LocalTime.of(13, 30);
		System.out.println(horarioAlmoco);
		
		LocalTime horaInicioAlmoco = LocalTime.of(12, 50);
		LocalTime horaFimAlmoco = LocalTime.of(13, 35);
		Duration duracaoAlmoco = Duration.between(horaInicioAlmoco, horaFimAlmoco);
		System.out.println(duracaoAlmoco);
		
		System.out.println( duracaoAlmoco.getSeconds() );
		
	}
}
