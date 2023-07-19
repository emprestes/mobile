package fono.app

import io.r2dbc.spi.ConnectionFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator
import org.springframework.web.reactive.config.EnableWebFlux


@SpringBootApplication
@EnableWebFlux
@EnableR2dbcRepositories
class FonoApi {

    @Bean
    fun initializer(connectionFactory: ConnectionFactory) = ConnectionFactoryInitializer().apply {
        setConnectionFactory(connectionFactory)
        setDatabasePopulator(ResourceDatabasePopulator(ClassPathResource("schema.sql")))
    }
}

fun main(args: Array<String>) {
    runApplication<FonoApi>(*args)
}
