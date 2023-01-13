package cn.itcast.n9;


/**
 * RejectPolicy
 *
 * @author hyong
 * @since 2023/1/13
 */
@FunctionalInterface
public interface RejectPolicy<T> {
    /**
     * 拒绝方法
     *
     * @param queue
     * @param task
     */
    void reject(BlockingQueue<T> queue, T task);
}
