
const managerConverter = (utils) => {
  return class extends utils {

    /**
     * Parse cards v2 API response to v1
     * @param {Object} apiResponse
     */
    convertCardsV2ToV1(apiResponse) {
      var cardDataV1 = {};
      Object.assign(cardDataV1, ...Object.keys(apiResponse).filter(key => key !== 'relatedContracts').map(key => ({[key]: apiResponse[key]})));
      cardDataV1 = this._convertV2CardData(cardDataV1);
      return {
        ...cardDataV1,
        relatedContracts: apiResponse.relatedContracts ? this._convertV2RelatedContracts(apiResponse.relatedContracts) : [],
      };
    }

    /**
     * Converter card data from V2 to V1
     * @param {Object} cardData
     * @returns {Array}
     */
    _convertV2CardData(cardData) {
      var cardDataV1Converted = {};
      Object.assign(cardDataV1Converted, ...Object.keys(cardData).filter(key => key !== 'product' && key !== 'cardType' && key !== 'availableBalance' && key !== 'disposedBalance').map(key => ({[key]: cardData[key]})));
      if (cardData.product) {
        Object.assign(cardDataV1Converted, { product: Object.keys(cardData.product).filter(key => key !== 'subProduct').reduce((objectAccumulator, key) => {
          objectAccumulator[key] = cardData.product[key];
          return objectAccumulator;
        }, {})});
        if (cardData.product.subProduct) {
          Object.assign(cardDataV1Converted, { product: {
            ...cardDataV1Converted.product,
            name: cardData.product.subProduct.name,
          }});
        }
      }
      if (cardData.cardType) {
        Object.assign(cardDataV1Converted, { cardType: Object.keys(cardData.cardType).filter(key => key !== 'availableBalance' && key !== 'disposedBalance' && key !== 'grantedCredits' && key !== 'holderName' && key !== 'physicalSupport').reduce((objectAccumulator, key) => {
          objectAccumulator[key] = cardData.cardType[key];
          return objectAccumulator;
        }, {})});
        if (cardData.cardType.availableBalance) {
          Object.assign(cardDataV1Converted, { availableBalance: {
            ...Object.keys(cardData.cardType.availableBalance).reduce((objectAccumulator, key) => {
              objectAccumulator[key] = cardData.cardType.availableBalance[key];
              return objectAccumulator;
            }, {})
          }});
        }
        if (cardData.cardType.disposedBalance) {
          Object.assign(cardDataV1Converted, { disposedBalance: {
            ...Object.keys(cardData.cardType.disposedBalance).filter(key => key !== 'currentBalances').reduce((objectAccumulator, key) => {
              objectAccumulator[key] = cardData.cardType.disposedBalance[key];
              return objectAccumulator;
            }, {}),
            currentBalances: cardData.cardType.disposedBalance.currentBalances.map(key => ({ amount: key.amount.amount, currency: key.amount.currency })),
          }});
        }
        if (cardData.cardType.grantedCredits) {
          Object.assign(cardDataV1Converted, { grantedCredits: cardData.cardType.grantedCredits });
        }
        if (cardData.cardType.holderName) {
          Object.assign(cardDataV1Converted, { holderName: cardData.cardType.holderName });
        }
        if (cardData.cardType.physicalSupport) {
          Object.assign(cardDataV1Converted, { physicalSupport: cardData.cardType.physicalSupport });
        }
      }
      if (cardData.availableBalance?.currentBalances) {
        Object.assign(cardDataV1Converted, { availableBalance: {
          ...cardDataV1Converted.availableBalance,
          currentBalances: cardData.availableBalance.currentBalances.map(key => ({ amount: key.amount.amount, currency: key.amount.currency })),
        }});
      }
      return cardDataV1Converted;
    }

    /**
     * Converter for card related contracts V2 to V1
     * @param {Array} relatedContracts
     * @returns {Array}
     */
    _convertV2RelatedContracts(relatedContracts) {
      var cardDataRelatedContractsV1Converted = relatedContracts.map(key => {
        var result = Object.keys(key).reduce((objectAccumulator, keyItem) => {
          if (keyItem === 'contractDetails') {
            Object.keys(key[keyItem]).filter(keyItemContractType => keyItemContractType !== 'contractType').reduce((objectAccumulatorContractDetails, keyItemContractType) => {
              objectAccumulator[keyItemContractType] = key[keyItem][keyItemContractType];
              return objectAccumulatorContractDetails;
            }, {});
          } else {
            objectAccumulator[keyItem] = key[keyItem];
          }
          return objectAccumulator;
        }, {});
        return result;
      });
      return cardDataRelatedContractsV1Converted;
    }

    /**
     * Converter for card conditions V2 to V1
     * @param {Array} conditions
     * @returns {Array}
     */
    convertV2Conditions(conditions) {
      var cardDataConditionsV1Converted = conditions?.map(key => {
        var result = Object.keys(key).reduce((objectAccumulator, keyItem) => {
          if (keyItem === 'formats') {
            Object.keys(key[keyItem][0]).filter(keyItemFormats => keyItemFormats === 'format').reduce((objectAccumulatorContractDetails, keyItemFormats) => {
              objectAccumulator[keyItemFormats] = key[keyItem][0][keyItemFormats];
              return objectAccumulatorContractDetails;
            }, {});
          } else if (keyItem !== 'conditionType') {
            objectAccumulator[keyItem] = key[keyItem];
          }
          return objectAccumulator;
        }, {});
        return result;
      });
      return cardDataConditionsV1Converted;
    }

  };
};
