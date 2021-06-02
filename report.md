# Отчёт о тестировании "Money Transfer"
## Краткое описание
26.05.2021 было проведено проверка пополнения счёта VIP-клиента в приложении "Money Transfer"

На тестирование затрачено: 20 минут

## Раздел дефектов
В результате тестирования выявлены следующие дефекты:

1. Ошибочный отрицательный остаток при пополнении счёта свыше 2 млрд руб
        
   [Ссылка на багрепорт](https://github.com/rubinov2016/netology_java_2.1/issues/1)
   
## Описание процесса тестирования
В процессе тестирования использовался следующий код:
```java
public class Main {
 public static void main(String[] args) {
    int accountCurrentBalance;
    int transferAmount;
    int accountFinalBalance;
    accountCurrentBalance =  2_000_000_000; //(два миллиарда рублей)
    transferAmount = 500_000_000; //(пятьсот миллионов рублей)
    accountFinalBalance = accountCurrentBalance + transferAmount;
    System.out.println(accountFinalBalance);
 }
}
```
В качестве тестовых данных использовались данные
* текущий баланс счёта клиента - переменная accountCurrentBalance типа int, значение - 2_000_000_000 (два миллиарда рублей)
* сумма перевода - переменная transferAmount типа int, значение - 500_000_000 (пятьсот миллионов рублей)
* переменная accountFinalBalance для хранения итогового значения - тип int. Ожидаемое значение 2_500_000_000 (два миллиарда пятьсот миллионов рублей)

### Тестирование производилось в следующем окружении:

* Microsoft Windows [Version 10.0.19042.928]
* openjdk version "11.0.10" 2021-01-19
* OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.10+9)
* OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.10+9, mixed mode)
