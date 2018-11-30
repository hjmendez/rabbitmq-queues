Instalar RabbitMQ
===================

1 - Insalar el Erlang : otp_win64_21.1.exe
2 - Instalar el servidor RabbitMQ: rabbitmq-server-3.7.9.exe 
3 - Habilitar el administrador web: en consola 
	> cd C:\Program Files\RabbitMQ Server\rabbitmq_server-3.7.9\sbin>
	> rabbitmq-plugins enable rabbitmq_management
4 - Acceder al administrador: http://localhost:15672 (guest:guest)
5 - Configurar las colas y los exchanges 	


Conceptos principales

Productor > emite mensajes al exchange
Consumidor > consume mensajes de la queue
Binding > conecta un exchange con una queue usando binding key
Tipos de exchanges > fanout, direct, topic and headers


https://www.rabbitmq.com/tutorials/tutorial-one-spring-amqp.html