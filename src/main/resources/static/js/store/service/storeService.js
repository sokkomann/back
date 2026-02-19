const storeService = (() => {
    const getMarkets = async (region, callback) => {
        const response = await fetch(`/api/store/region/${region}`);
        const markets = await response.json();
        if(callback) {
            callback(markets);
        }
    }

    const getAllStores = async (page, callback) => {
        page = page || 1;

        const response = await fetch(`/api/store/list/${page}`);
        const storeWithPagingDTO = await response.json();
        if(callback) {
            return callback(storeWithPagingDTO);
        }
    }

    const getList = async (page, {region, categoryId, marketId, state, orderValue}, callback) => {
        page = page || 1;
        region = region || "";
        state = state || "";
        orderValue = orderValue || "";

        const params = new URLSearchParams();
        params.append("region", region);
        params.append("state", state);
        params.append("orderValue", orderValue);
        if (categoryId) params.append("categoryId", categoryId);
        if (marketId) params.append("marketId", marketId);

        const response = await fetch(`/api/store/list/${page}?${params.toString()}`);
        const storeWithPagingDTO = await response.json();
        if(callback) {
            return callback(storeWithPagingDTO);
        }
    }

    return {getMarkets: getMarkets,
            getList: getList};
})();