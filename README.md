# Spring microservices in Action
## The history my learning Spring boot and notes for future me

rules: 
- Don't use online translates for many phases


* I meet the Docker

Now, I can build Dockerfiles and run/stop it and check status of running containers

* Parallel, I learn the Git as main VCS in my stack.

As in the back-time I used only Git with GUI or integrated in IDEA. Now, I learn and try to use only CLI.

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
### 22.12.2023 start at around 19:00
Взял долгий перерыв от учебы. Очень сильный недосып.

### My log for my study 
#### GIT&Spring-config-server
- I have a problems. Every time I push to GitHub and I should fill username and password for access push. I change the protocol from http to ssh. Resolve
- Test how working remote config repo. I try to comment local config data and re-build docker images
- Don't work. Learn additional study-source. Config-server cannot fetch configuration from git. Failed auth.
- Resolved all problems with connection between Git and Spring-Config-service: 22:43

#### Meet with Vault and store the secrets
- I skip this chapter on practice part
- The Vault is storage for secrets and great crypt a sensitive data.
- We can use KV (key-value?) for store. And I cannot get config-data without vault's root token.
- Token, a.k.a X-Config-Token is http-request in head. Simplify: -H "X-Config-Token: token_root"

#### 23.12.23 1:23 - Key, Tokens, Encrypt
- У нас есть 3 точки ввода ключа: файл compose(licensingservice, configservice) и bootstrap.yml у configservice.
Зачем нам 3 точки входа? Если я запускаю локально сервер конфигурации - ключ в bootstrap
Если запускаю контейнер Docker, то используются ключи configserver:enctypt_key. Когда я запускаю контейнер, участвует 
ли как-то ключ из bootstrap или Docker переопределяет ключи от Spring-Config-Server
- В книге указано, что хранение ключей в Docker - плохая идея для промышленного окружения
- Как тогда правильно хранить ключи для Docker и для bootstrap.yml? и сохранить простоту использования и развертывания
- https://www.baeldung.com/ops/docker-securing-passwords
- Думаю, изучить Vault получше и организовать хранение секретов там.
- Или изучить Docker secrets
- Пойти простым путем, используя .env файлы
- Мысль: гарантировать разработчиком, что секрет для bootstrap и docker будут всегда одинаковы, чтобы избежать дрейфа конфигураций?

#### 23.12.23 14:10 - Continue to learn Vault
- I can't pull docker vault. Problem with some manifest.
- Try using .env file and .gitignore
- 16:50. I'm upgrade my skills in make configuration.
- My services don't work as local-app, but successes start in docker container
I create and fix environment for localhost and stay for docker
- I kill much time for change port on my local database(psql)
- I got many problems. Server postgres don't run after change port; I can't find how to resolve with a problem;
But I learn more info about the settings of psql; ps_lscluster for monitoring exit clusters on server
ps_ctrlcluster for execute operation on need cluster (up/down);
Configuration file for psql located at /etc/postgresql/<ver>/<clustername>/postgresql.conf
- I take goal change port in psql (locale or container);
Before run container, I need to stop postgresql service. It's not comfortable. I want to run localhost psql and container psql without exception for "already used port"
I think take time to study English.
- Next I want to practice git branch, merge, etc. Command from add to push I learned.

#### 02.05.2024 - Continue to learn Eureka and Docker
- I'm refreshed my mind and skills for Docker. Meeting with Eureka and Load Balancer
- Now I use OS Windows. This is very different feel. It's so hardly better linux.
