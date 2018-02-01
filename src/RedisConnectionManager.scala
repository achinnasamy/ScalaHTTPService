import com.redis.RedisClient

/**
  * Created by dharshekthvel on 12/1/18.
  */
object RedisConnectionManager extends App {

  val _rc = new RedisClient("localhost", 6379)

  _rc set ("tweet","march_forth_data")

  _rc save


}
