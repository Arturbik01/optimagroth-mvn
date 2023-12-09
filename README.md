#Spring microservices in Action
##The history my learning Spring boot and notes for future me
* I meet the Docker

Now, I can build Dockerfiles and run/stop it and check status of running containers

* Parallel, I learn the Git as main VCS in my stack.

As in the back-time I used only Git with GUI or integrated in IDEA. Now, I learn and try use only CLI.

* My english is low-level in grammatical, but medium-size in count learned words.

Now I want learn next the algorithmic and books The Spring boot in action, and some book for upper my skill Git or else VCS (Vault?). 

Right now, when I write it at 01:56 AM. My place in Ivanvo, Bogorodskoe.

#09.12.2023
Научился правильно коммитить ветки в удаленный репозиторий. Правильно и по памяти создавать токены в гитхабе.
Получилось удалить лишнюю активную ветку удаленно и локально.
Создал второй репозиторий для хранения конфигурацию. 
Учусь работать с удаленными конфигами в репозитории, чтобы подгружать их автоматически с помощью Actuator - @RefreshScope

Настроил idea для более быстрой сборки образов (забилдил кнопки в идеи, а не собирал через CLI, а по разным репозиториям)

Освежил знания про составление репозиториев используя Spring Data Jpa.

Немного проникся и познал сочетание/стек postgres+docker, их работу по алиасам. Нельзя обращаться к контейнерам по localhost:<port>.

Ощутимого результата по RefreshScope не ощутил и не понял, как именно должно работать.
- Аннотация @RefreshScope обновяет объекты с аннотациями @ConfigurationProperties.
- У меня есть ConfigService, который обрабатывает поля example.
- Могу ли я обновить/изменить в конфигах параметры example в файловой системе (не classpath в запущенном target), не пересобирая образ или перезапустить только один?
- У меня не получилось подгрузить автоматом и динамически и без перезапусков. Возможно, получится с гит.

Время 03:38. Завтра выходной, надо спать. В следующий раз попробую мержить специально с конфликтами
