# Отчёт о тестировании "Money Transfer"
## Краткое описание
26.05.2021 было проведено проверка пополнения счёта VIP-клиента в приложении "Money Transfer"

На тестирование затрачено: 20 минут

## Раздел дефектов
В результате тестирования выявлены следующие дефекты:

1. Ошибочный остаток при пополнении счёта 
   
   Ожидаемое значение остатка
   
   2_500_000_000
   
   Фактическое значение остатка
   
   -17_94_967_296
   
   [Ссылка1](https://monosnap.com/file/avKVmq0xT7Cj5KitdVlFwEgccl41Hm)
   [Ссылка2](https://monosnap.com/file/blyyLiNHfCetbgktTw2cYPWVhtj4ei)

## Описание процесса тестирования
В процессе тестирования использовался следующий код:
```java
public class Main {
 public static void main(String[] args) {
    int accountCurrentBalance;
    int transferAmount;
    int accountFinalBalance=0;
    accountCurrentBalance =  2_000_000_000; //(два миллиарда рублей)
    transferAmount = 500_000_000; //(пятьсот миллионов рублей)
    accountFinalBalance = accountCurrentBalance + transferAmount;
    System.out.println(accountFinalBalance);
 }
}
```



### Тестирование производилось в следующем окружении:

* Microsoft Windows [Version 10.0.19042.928]
* openjdk version "11.0.10" 2021-01-19
* OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.10+9)
* OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.10+9, mixed mode)
