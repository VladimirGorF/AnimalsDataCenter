 ## Запуск программы осуществляется в папке src -> main ##
 
 ### Описание проекта: ###
 
 Вашему вниманию представлен консольный репозиторий-хранилище животных 6 различных классов,
принадлежащих родительским классам домашних и вьючных животных.

  Хранилище позволяет:
  
  создавать животных - CREATE.
  
  создавать команды (TEACH), которые они умеют выполнять.
  
  Можно посмотреть конкретное животное или его команды по id - READ.
  
  Перечень всех id  и животных выводится командой - SHOWALL.
  
  Перечень команд - SHOWCOM.
  
  Тип животного - TYPE.
  
  Удалить животное  - DEL.
  
  Навигация реализована командой NAVI.
  
  Выход из программы - EXIT.
  
  Регистр введенных команд не имеет значения.
  
  &nbsp;
  &nbsp;
  
  Идентификация принадлежности к тому или иному классу производится по голосу.
  
  Виды голосов животных  представленны в enum TypeVoice {
    GRR,
    MYAU,
    GAV,
    IAA,
    IGOGOO,
    CHIU
} и будут представлены Вам на обозрение автоматически при создании животного.

Регистр введения голоса также не имеет значения.

<img width="2048" alt="Снимок экрана 2023-06-17 в 22 21 26" src="https://github.com/VladimirGorF/AnimalsDataCenter/assets/110591063/bb399291-08f2-4976-98aa-5164bc2b8224">
&nbsp;
Счетчик заведенных за сеанс животных представлен классом Counter.

  <img width="2048" alt="Снимок экрана 2023-06-17 в 22 28 46" src="https://github.com/VladimirGorF/AnimalsDataCenter/assets/110591063/e7636061-51ef-446a-949d-e291d7cd98ea">
&nbsp;
Данные о животных сохраняются в файле animals.txt

Данные о командах, которые умеют животные, сохраняются в файле fileCommands.txt

Данные счетчика сохраняются в файле file.txt


Приятного пользования!

