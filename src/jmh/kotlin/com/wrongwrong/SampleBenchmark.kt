package com.wrongwrong

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import java.math.BigDecimal
import java.util.concurrent.ThreadLocalRandom

// JMHのベンチマーク関連の内容は`open class`として定義する必要が有る
open class SampleBenchmark {
    @State(Scope.Thread)
    open class Input {
        val a: BigDecimal = ThreadLocalRandom.current().nextDouble(MAX_VALUE).toBigDecimal()
        val b: BigDecimal = ThreadLocalRandom.current().nextDouble(MAX_VALUE).toBigDecimal()

        companion object {
            private const val MAX_VALUE = 10000.0
        }
    }

    @Benchmark
    fun measureAdd(input: Input): BigDecimal = input.a + input.b
}
