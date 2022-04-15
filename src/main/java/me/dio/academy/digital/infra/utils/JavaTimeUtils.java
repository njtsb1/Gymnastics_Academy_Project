package me.dio.academy.digital.infra.utils;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Nivaldo Beirão
 */
public class JavaTimeUtils {
	
	private JavaTimeUtils() {}
	
	private  static final Locale LOCALE_BR = new Locale("pt", "BR");
	
	public static final DateTimeFormatter LOCAL_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", LOCALE_BR);
	public static final DateTimeFormatter LOCAL_DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy", LOCALE_BR);

}
