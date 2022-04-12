import random
from time import perf_counter


def quicksort(nums):

    ''' Функция быстрой сортировки массива.
    
        В качестве алгоритма сортировки выбрал quicksort, поскольку это один из самых быстрых
        и универсальных алгоритмов сортировки массивов:  работает в среднем за O(nlogn).
        
        Можно было бы добавить критерий выбора опорного элемента, однако, поскольку в задаче предполагается, 
        что массив может быть уже отсортированным - оставил выбор случайнгым образом.
        
    '''
    
    if len(nums) <= 1:
        return nums
    else:
        q = random.choice(nums)
        
    l_nums = [n for n in nums if n < q]
    e_nums = [q] * nums.count(q)
    b_nums = [n for n in nums if n > q]
 
    return quicksort(l_nums) + e_nums + quicksort(b_nums)


if __name__ == "__main__":

    random.seed(42)
    test_arr = [random.randint(0, 100) for i in range(100)]
    
    start_time = perf_counter()
    sorted_arr = quicksort(test_arr)
    print('total amount of time: {}'.format(perf_counter() - start_time))
    
    #print(test_arr, '\n', sorted_arr)
