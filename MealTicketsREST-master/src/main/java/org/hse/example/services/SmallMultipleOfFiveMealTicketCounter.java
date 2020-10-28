package org.hse.example.services;

import org.hse.example.MealTicket;
import org.springframework.stereotype.Service;

/**
 * Сервис для работы со счастливыми билетами, кратыми пяти
 */
@Service("smallMultipleOfFiveMealTicketCounter")
public class SmallMultipleOfFiveMealTicketCounter extends SmallMealTicketCounter {

    /**
     * Метод выполняет дополнительную фильтрацию билетов
     *
     * @param ticket билет
     * @return результат работы фильтра
     */
    @Override
    protected boolean doFilter(MealTicket ticket) {
        return ticket.accept(hasOrdinal -> hasOrdinal.getOrdinal() % 5 == 0);
    }
}
