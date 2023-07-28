package mobile.app

import io.r2dbc.spi.ConnectionFactory
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.function.client.WebClient.create

@SpringBootApplication
@EnableWebFlux
@EnableR2dbcRepositories
class MobileApi {

    @Bean
    fun initializer(connectionFactory: ConnectionFactory) = ConnectionFactoryInitializer().apply {
        setConnectionFactory(connectionFactory)
        setDatabasePopulator(ResourceDatabasePopulator(ClassPathResource("schema.sql")))
    }

    @Bean
    @Qualifier("webClient")
    fun webClient() = create("https://fonoapi.freshpixl.com")

    @Bean
    @Qualifier("localWebClient")
    fun localWebClient() = create("http://localhost:8070")
}

fun main(args: Array<String>) {
    runApplication<MobileApi>(*args)
}

