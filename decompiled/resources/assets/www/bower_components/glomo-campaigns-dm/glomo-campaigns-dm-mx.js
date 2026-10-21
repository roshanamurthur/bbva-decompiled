/* global GlomoCampaignsDmMixin */
class GlomoCampaignsDmMx extends Polymer.mixinBehaviors(CellsBehaviors.i18nBehavior, GlomoCampaignsDmMixin.mixin(Polymer.Element)) {

  static get is() {
    return 'glomo-campaigns-dm-mx';
  }

  static get properties() {
    return {
      /**
       * List of feature flags
       * @type {Object}
      */
      featureFlagsCollection: {
        type: Object,
        value: () => ({})
      },
      /**
       * List of offers when get app settings
       * @type {Object}
       */
      offersAppSettings: {
        type: Object,
        value: () => ({})
      },
      /**
       * List of included offers by offer id
       * @type {Array}
       */
      includeOffers: {
        type: Array,
        value: () => []
      },
      /**
       * List of accumulated offers
       * @type {Array}
       */
      _accOffers: {
        type: Array,
        value: () => []
      },
      /**
       * Counts number of requests made
       * @type {Number}
       */
      _requestCounter: {
        type: Number,
        value: 0
      },
      /**
       * Contains add funds (0FIN) and deposit hiring (0PGR) offers
       * @type {String}
       */
      staticOffers: {
        type: Array,
        value: () => [{
          bannerLink: 'cells-oc-banner-iwant',
          bannerType: 'coming-soon',
          config: {
            description: 'glomo-campaigns-dm-offer-deposit-description',
            text: '',
            name: 'glomo-campaigns-dm-offer-deposit-name',
            class: 'banner--image-center',
            offerId: 'DEPOSIT_CONTRACTING',
            isSimulationAllowed: false,
            amount: {
              amount: '2000.00',
              currency: 'MXN',
              description: ''
            },
            contractId: '',
            smallImg: {
              id: 'FONDOS_INVERSION',
              src: './images/contractProductSection/invest.svg',
              alt: 'FONDOS_INVERSION',
            },
            product: {
              productId: '0PGR',
              productTypeId: 'DEPOSITS'
            },
            priority: 0,
            originalPayload: {
              amounts: [
                {
                  description: '',
                  amount: '2000',
                  currency: 'MXN'
                }
              ],
              description: 'glomo-campaigns-dm-offer-deposit-description-original',
              id: 'DEPOSIT_CONTRACTING',
              image: {
                url: 'https://archivingbbva.axtel.mx:443/v2/documents/logo?key=avatar_CAMPAIGN0PGR-OF',
                id: 'NKCQ02V6DV95E5ZK7JMVMG6M84XT7Q0354QNR03HHT3Q9YXDR4Z9A5VRAZJ7N0TS7GMRDZWRQM18P',
                name: 'avatar_CAMPAIGN0PGR-OF'
              },
              isImproved: false,
              isShownInDashboard: false,
              isSimulationAllowed: false,
              name: 'glomo-campaigns-dm-offer-deposit-name',
              offerType: {},
              origin: {},
              priority: 0,
              product: {
                contractId: '',
                id: '0PGR',
                operationType: {},
                productType: {
                  id: 'DEPOSITS',
                  name: 'DEPOSITS'
                }
              }
            },
          },
        },
        {
          bannerLink: 'cells-oc-banner-iwant',
          bannerType: 'oc-fund',
          config: {
            description: 'glomo-campaigns-dm-offer-funds-description',
            text: '',
            name: 'glomo-campaigns-dm-offer-funds-name',
            class: 'banner--image-center',
            offerId: 'FUND_CONTRACTING',
            offerType: {
              name: 'cells-oc-banner-offer-type-name-funds',
              id: 'OC_FUND'
            },
            endDate: null,
            amount: {
              amount: '50.00',
              currency: 'MXN',
              description: ''
            },
            isShownInDashboard: false,
            product: {
              productId: '0FIN',
              contractId: '',
              productTypeId: 'FUNDS'
            },
            smallImg: {
              id: 'FONDOS_INVERSION',
              src: './images/contractProductSection/invest_dollar.svg',
              alt: 'FONDOS_INVERSION',
            },
            priority: 0,
            originalPayload: {
              amounts: [
                {
                  description: '',
                  amount: '50',
                  currency: 'MXN'
                }
              ],
              description: 'glomo-campaigns-dm-offer-funds-description-original',
              id: 'FUND_CONTRACTING',
              image: {
                url: 'https://archivingbbva.axtel.mx:443/v2/documents/logo?key=avatar_CAMPAIGN0FND-OF',
                id: 'NKCQ02V6DV95E5ZK7JMVMG6M84XT7Q0354QNR03HHT3Q9YXDR4Z9A5VRAZJ7N0TS7GMRDZWRQM18P',
                name: 'avatar_CAMPAIGN0FIN-OF'
              },
              isImproved: false,
              isShownInDashboard: false,
              isSimulationAllowed: false,
              name: 'glomo-campaigns-dm-offer-funds-name',
              offerType: {},
              origin: {},
              priority: 1,
              product: {
                contractId: '',
                id: '0FIN',
                operationType: {},
                productType: {
                  id: 'FUNDS',
                  name: 'FUNDS'
                }
              },
            },
          }
        }]
      },
      /**
       * Determine when the offer has pre approved offers
       * @type {Boolean}
       */
      _hasPrioritizedOffers: {
        type: Boolean,
        value: false
      },
      /**
       * Indicates new priority for offers
       * @type {Object}
       */
      offersPriority: {
        type: Object,
        value: () => ({
          '0SKY': '0',
          '00CB': '1'
        })
      },
      /**
       * Determine when data deposits contracts hiring
       * @type {Object}
       */
      dataDepositContracts: {
        type: Object,
        value: () => ({})
      },
      /**
       * When you have deposit contracts
       * @type {Boolean}
       */
      _haveDepositContracts: {
        type: Boolean,
        value: false,
      },
      /**
       * Receives offers cards external to list offers service
       */
      _externalOffers: {
        type: Array,
        value: () => []
      },
      /**
       * Indicates whether external offers should be expected
       */
      showReviewOffers: {
        type: Boolean,
        value: false
      },
      /**
       * Amount of external offers to receive
       */
      reviewOffersAmount: {
        type: Number,
        value: 0
      },
      /**
       * Check if Stand In flag is active mode
       * @type {Boolean}
       */
      standIn: {
        type: Boolean,
        value: false,
      },
      /**
       * Contain products with duplicate ids
       * type {Object}
       * @example { LOANS: {duplicateId: '', renamedId: ''}}
       */
      duplicateIdProducts: {
        type: Object,
        value: () => ({})
      },
      /**
       * List of customizable offers
       * @type {Object}
       * @example { CARDS: {description: '', text: '', smallImg: {}}}
       */
      customizableOffers: {
        type: Object,
        value: () => ({})
      },
      /**
       *This property has the global cache storage
       * @type {Object}
       */
      globalCacheStorage: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description accounts from dashboard or finantial overview
       * @type {Array}
       */
      dashboardAccountsStorage: {
        type: Array,
        value: () => ([])
      },
      /**
       * @description Object whit value offers active to filter
       * @type {Object}
       */
      objectOffersFlags: {
        type: Object,
        value: () => ({})
      },
      /**
       * Offers from CRM
       * @type {Array}
       * @notify
       * @default []
       */
      offersCRM: {
        type: Array,
        value: () => [],
        notify: true
      },
      /**
       * Offer product id reward
       * @type {String}
       */
      offerProductIdReward: {
        type: String,
        value: ''
      },
      /**
       * Flag to know minior account
       */
      isGlomoMiniorAccount: {
        type: Boolean,
        value: false
      }
    };
  }

  static get observers() {
    return [
      '_getDataFromDepositHiring(dataDepositContracts.*)'
    ];
  }

  /**
   * Retrieve the campaigns for contract product section
   * @overwrite GlomoCampaignsDmMixin
   */
  getOffersCPS() {
    this.isContractProductSection = true;
    this.showAllOffers = true;

    if (!this.isIneligible) {
      let params = '';
      if (this._requestCounter === 1) {
        params = this.paramsCPS;
      }
      this.$.dm.getOffers(params);
    }
  }

  getOfferStandIn() {
    if (!this.standIn && !this.isGlomoMiniorAccount) {
      this.getOffers();
    }
  }

  /**
   * Set offers from CRM
   * @param {Array} ev with the offers from CRM
   */
  _onSetOffers(ev) {
    if (!this.isContractProductSection) {
      this.set('offersCRM', ev.detail);
    }
  }

  /**
   * Return parsed offers
   * @param {Array} retrievedOffers with the retrieved offers
   * @returns {Array} campaigns configuration
   * @overwrite GlomoCampaignsDmMixin
   */
  _getParsedOffers(retrievedOffers) {
    const keyAuto = this.featureFlagsCollection['glomo.offers.ocCarLoan.leadRefactor']?.value;
    if (keyAuto === false) {
      retrievedOffers = retrievedOffers.filter(item => item.name !== 'AUTOMOVIL');
    }

    const filterOffers = this._filterOffersByDate(retrievedOffers);
    const orderNonPreApprovedOffers = this._changeNonPreApprovedOffersPriority(filterOffers);
    const orderByPriority = this._sortOffersByPriority(orderNonPreApprovedOffers);
    const offersByPage = this._filterOffersByPage(orderByPriority);
    const offers = this._changeIdForDuplicateLDA(offersByPage);
    const parseOffers = this._parseOffers(offers);
    const offerTypeOffers = this._parseOfferType(parseOffers);
    const customOffers = this._parseCustomizableOffers(offerTypeOffers);
    const filterFlagsOffer = this._filterFlagsOffers(customOffers);
    return this._includeOffersComingSoon(filterFlagsOffer);
  }

  /**
   * Receives the offers and according to the flag, filters and discards those that are false
   * * @param {Array} offers with the offers to show depending the flags
   */
  _filterFlagsOffers(offers) {
    offers.map(offer => {
      const objectOfferFlag = this.get('flag', this.objectOffersFlags[this.get('config.product.productId', offer)]) || '';
      const keyValue = this.get('value', this.featureFlagsCollection[objectOfferFlag]) || false;
      const ldaValue = this.get('lda', this.objectOffersFlags[this.get('config.product.productId', offer)]) || false;
      if (!keyValue) {
        offers = offers.filter(item => item.config.product.productId !== ldaValue);
      }
    });
    return offers;
  }


  /**
   * Change the id value when it is duplicated
   * Example: an offer can have the same id but with a different product type
   * @param {Object} offers
   * @return {*}
   */
  _changeIdForDuplicateLDA(offers) {
    return offers.map(offer => {
      if (this.duplicateIdProducts && this.duplicateIdProducts[this.get('product.productType.id', offer)]
          && this.duplicateIdProducts[this.get('product.productType.id', offer)].duplicateId === this.get('product.id', offer)) {
        offer.product.id = this.duplicateIdProducts[this.get('product.productType.id', offer)].renamedId;
      }
      return {
        ...offer
      };
    });
  }

  /**
   * Integrates an object with customizable properties of each offer as long as the product
   * type and product id exist within the properties of the object that brings the customization
   * @param {Object} offers
   * @return {*}
   */
  _parseCustomizableOffers(offers) {
    return offers.map(offer => {
      const { productId, productTypeId } = this.get('config.product', offer);
      if (this.customizableOffers && this.customizableOffers[productTypeId] && this.customizableOffers[productTypeId][productId]) {
        let lastDigitCard = this.get('config.originalPayload.product.productType.name', offer) || '';
        lastDigitCard = lastDigitCard.substring(lastDigitCard.indexOf('*') + 1, lastDigitCard.length);
        const {description, text, smallImg, serviceDescription = false} = this.customizableOffers[productTypeId][productId];
        return {
          ...offer,
          config: {
            ...offer.config,
            description: serviceDescription ? this._textBannerConfig(offer, this.isContractProductSection, 'description') : `${this.t(description)}${lastDigitCard ? ` •${lastDigitCard}` : ''}`,
            text: serviceDescription ? this._textBannerConfig(offer, this.isContractProductSection, 'text') : text,
            smallImg: smallImg
          }
        };
      } else {
        return offer;
      }
    });
  }

  /**
   * @description Set customizable offers text and description
   * @param {*} offer
   * @param {Boolean} isContractProductSection
   * @param {String} type
   * @returns {String} - description or title
   */
  _textBannerConfig(offer, isContractProductSection, type) {
    if (type === 'text') {
      return isContractProductSection ? `${offer?.config?.originalPayload?.description}` : '';
    }

    if (type === 'description' && isContractProductSection) {
      return `${offer?.config?.originalPayload?.name}`;
    }

    return `${offer?.config?.originalPayload?.description}`;
  }

  /**
   * Observer. Store accounts data form accounts prop
   * @param {Object} data with the contracts available to the user
  */
  _getDataFromDepositHiring(data) {
    const accounts = this.c(data, 'base.data', '');
    if (accounts) {
      const contracts = this.c(accounts, 'contracts', []);
      const constractsDeposits = contracts.filter((e)=> e.productType === 'DEPOSIT');
      if (constractsDeposits.length > 0) {
        this._haveDepositContracts = true;
      }
    }
  }

  /**
   * Awaits and concatenates external cards config with the ones received by the campaigns service
   * @param {Object} offer
   */
  setExternalOffers(offer) {
    if (!offer) {
      offer = {};
    }

    this.set('_externalOffers', [...this.get('_externalOffers'), offer]);

    if (this.get('_externalOffers').length === this.reviewOffersAmount) {
      this.get('_accOffers').splice(1, 0, ...this.get('_externalOffers'));
      this._launchOffers();
    }
  }

  /**
   * Receives parsed offers and validates the request counter for launch the second request
   * or set the offers to be show
   * @param {Array} offers - parsed offers
   */
  validateReceivedOffers(parsedOffers) {
    if (this.isContractProductSection) {
      if (!parsedOffers) {
        parsedOffers = [];
      }

      if (this._requestCounter === 0 && parsedOffers.length !== 0) {
        this._hasPrioritizedOffers = true;
      }

      this._validateYoungstersOffer(parsedOffers);
      this._requestCounter++;
      this._concatOffers(parsedOffers);

      if (this._requestCounter === 1) {
        const keyMortgage = this.featureFlagsCollection['glomo.contractProductSection.mortgageTracking']?.value;
        if (keyMortgage === false) {
          this.staticOffers = this.staticOffers.filter(item => item.config.offerId !== '0MTK');
        }

        let parsedStaticOffers = this._setStaticOffersAmountDescription(this.staticOffers);
        this._concatOffers(parsedStaticOffers);
        this.getOffersCPS();
      } else if (this._requestCounter === 2) {
        if (!this._hasPrioritizedOffers) {
          this._reorderOffers();
        }
        this._getExternalOffers();
      }
    }
  }

  /**
   * Validate if contains the offer from the service or show a static offer
   * @param {Array} parsedOffers
   */
  _validateYoungstersOffer(parsedOffers) {
    if (this.dashboardAccountsStorage.length !== 0) {
      const youngstersFlag = this.featureFlagsCollection?.['glomo.offers.accountYoung']?.value;
      const principalAccount = this.dashboardAccountsStorage?.[0]?.products?.some(product => product?.detail?.level === '04');
      const haveOffer = parsedOffers.find(offer => offer?.config?.offerType?.id === 'oc-account-young');
      if (!principalAccount || !youngstersFlag || haveOffer) {
        this.staticOffers = this.staticOffers.filter(item => item?.config?.offerId !== '0790');
      }
    }
  }

  /**
   * Change the offers order when there aren't pre approved offers
   */
  _reorderOffers() {
    const offers = this._accOffers;

    let hasNPAOffers = false;
    let newSortedOffers = [];

    const staticOffers = offers.slice(0, this.staticOffers.length);
    const npaOffers = offers.slice(this.staticOffers.length);

    if (npaOffers.length > 0) {
      hasNPAOffers = true;
    }

    if (hasNPAOffers) {
      const firstOffer = npaOffers.find((offer, index) => {
        return index === 0;
      });

      npaOffers.splice(0, 1);

      newSortedOffers = [firstOffer, ...staticOffers, ...npaOffers];
    } else {
      newSortedOffers = [ ...staticOffers ];
    }
    this.set('_accOffers', newSortedOffers);
  }

  /**
   * Concatenates offers received from different requests
   * @param {Array} newOffers
   */
  _concatOffers(newOffers) {
    this.set('_accOffers', [...this.get('_accOffers'), ...newOffers]);
  }

  /**
   * Dispatch event with the offers to show
   * @event data-campaigns
   * @event glomo-campaigns-close-veil
   */
  _launchOffers() {
    this._validateGoalsCard();
    this._validateOfferFoundsPromissory();
    this._dispatchEvent('data-campaigns', this.get('_accOffers'));
    this._dispatchEvent('glomo-campaigns-close-veil');
    this.set('_accOffers', []);
    this._requestCounter = 0;
    this._hasPrioritizedOffers = false;
    this.set('_externalOffers', []);
  }

  /**
   * Fires event to indicate that the component is ready to receive external offers
   * @event get-external-offers
   */
  _getExternalOffers() {
    if (this.showReviewOffers) {
      this._dispatchEvent('get-external-offers');
    } else {
      this._launchOffers();
    }
  }

  /**
   * Set amount description to static offers
   * @param {Array} offers
   * @returns {Array}
   */
  _setStaticOffersAmountDescription(offers) {
    let staticOffers = offers;
    staticOffers[0].config.amount.description = this.t('cells-oc-banner-amount-description-start-from');
    staticOffers[1].config.amount.description = this.t('cells-oc-banner-amount-description-from');

    return staticOffers;
  }

  /**
  * Return if offer has any NPA code
  * @param {Object} codes
  * @param {String} productId
  * @returns {Boolean}
  */
  _hasNPACode(codes, productId = '') {
    return Object.prototype.hasOwnProperty.call(codes, productId);
  }

  /**
  * Return offer name for NPA's
  * @param {String} offerOriginId
  * @param {String} productId
  * @param {String} description
  * @param {String} itemName
  * @param {Object} codes
  * @returns {String}
  */
  _getOfferName(offerOriginId = '', productId = '', description, itemName, codes) {
    const PRODUCT_ID_TDC_NPA = '0SKY';
    const isAltOffer = offerOriginId === 'ALT';
    const hasNPACode = this._hasNPACode(codes, productId);

    if (!hasNPACode) {
      return itemName;
    }

    if (isAltOffer) {
      return description;
    }

    if (productId === PRODUCT_ID_TDC_NPA) {
      const firstName = this.globalCacheStorage?.firstName || '';
      return `¡${firstName}, ${this.t(codes[productId])}`;
    }

    return codes[productId] || itemName;
  }

  /**
   * Generate the campaigns to show
   * @returns {Array} - parsed offers
   * @overwrite GlomoCampaignsDmMixin
   */
  _parseOffers(offers = []) {
    return offers.map(item => {
      const {
        bannerLink = 'cells-oc-banner-iwant',
        concatNameDescription,
        showDate,
        showAmountDescription,
        amountDescription
      } = this.config || {};

      const {
        amounts,
        description,
        id: offerId,
        image = {},
        isImproved,
        isShownInDashboard,
        isSimulationAllowed,
        name: itemName,
        offerType,
        period,
        priority,
        product = {},
        origin: offerOrigin = {},
      } = item.config || item;

      const codes = {
        '00CB': 'non-preapproved-offer-message-description-loans',
        '0SKY': 'non-preapproved-offer-message-description-tdc'
      };

      let offerName = this._getOfferName(offerOrigin?.id, product?.id, description, itemName, codes);

      const customeOfferCofig = this.customizableOffers[product?.productType?.id]?.[product?.id]?.config;
      const newShowDate = customeOfferCofig?.showDate !== undefined ? customeOfferCofig?.showDate : showDate;

      return {
        config: {
          originalPayload: item,
          offerId,
          class: 'banner--image-center',
          description: this.isContractProductSection ? offerName : this._parseDescription(itemName, description, concatNameDescription),
          text: (this.isContractProductSection && !this._hasNPACode(codes, product?.id)) ? description : '',
          name: itemName,
          offerType,
          isSimulationAllowed,
          endDate: this._parseDate(newShowDate, period),
          amount: this._parseAmount(showAmountDescription, amountDescription, amounts),
          isShownInDashboard,
          isImproved,
          product: this._parseProduct(product),
          smallImg: this._parseSmallImg(image),
          priority,
          period
        },
        bannerLink,
        bannerType: this._parseBannerType(item)
      };
    });
  }

  /**
   * Follows the normal flow when an error occurs
   * @overwrite GlomoCampaignsDmMixin
   */
  _onRetrieveCampaignsError() {
    if (this.isContractProductSection) {
      this.validateReceivedOffers();
    }
  }

  /**
   * Receive app settings configs
   * @param {Object} appSettings - global app settings
   */
  getOffersAppSettings(appSettings) {
    this.set('offersAppSettings', this.get('offers', appSettings) || {});
  }

  /**
   * Determine the redirect of the oc-banner deposits
  */
  redirectDepositsFlows() {
    const eventName = this._haveDepositContracts ? 'redirect-to-contract-payment-existing' : 'redirect-to-deposits-hiring';
    this._dispatchEvent(eventName);
  }

  /**
   * Change the offer priority based on the offer id
   * @param {Array} offers
   * @returns {Array} - offers with new priority
   */
  _changeNonPreApprovedOffersPriority(offers) {
    const newPriorityOffers = offers.map((offer) => {
      const offerId = this.get('product.id', offer);
      if (this.offersPriority[offerId]) {
        offer.priority = this.offersPriority[offerId];
      }
      return offer;
    });

    return newPriorityOffers;
  }

  /**
   * Parse offer type by appSettings
   */
  _parseOfferType(offers) {
    return offers.map(offer => {
      return {
        ...offer,
        config: Object.assign({}, offer.config, { offerType: this.offersAppSettings[offer.config.product.productId] })
      };
    });
  }

  /**
   * Set coming-soon to offerType when the offer isn't in includeOffers
   * @param {offers} offers
   * @returns {Array}
   */
  _includeOffersComingSoon(offers) {
    return offers.map(offer => {
      if (!this.includeOffers.includes(offer.config.product.productId)) {
        return {
          ...offer,
          config: {...offer.config, offerType: {id: 'coming-soon'}}
        };
      } else {
        return offer;
      }
    });
  }

  /**
   * Method to carry out card validations of static offers (Founds-Promissory note)
   * @returns {Boolean}
   */
  _validateOfferFoundsPromissory() {
    let newSortedOffers = this._accOffers;

    if (this._existOfferPromissory(this._accOffers)) {
      newSortedOffers = newSortedOffers.filter((offer) => offer.bannerType !== 'deposit-hiring');
    } else {
      newSortedOffers = newSortedOffers.filter((offer) => (this.get('config.product.productId', offer) !== '0786'));
    }
    if (this._existOfferFounds(this._accOffers)) {
      newSortedOffers = newSortedOffers.filter((offer) => offer.bannerType !== 'oc-fund');
    } else {
      newSortedOffers = newSortedOffers.filter((offer) => (this.get('config.product.productId', offer) !== '0787'));
    }

    this.set('_accOffers', [ ...newSortedOffers ]);
  }

  /**
   * Method to carry out validations with goals card
   * @returns {Boolean}
   */
  _validateGoalsCard() {
    let newSortedOffers = this._accOffers;
    if (!this._showGoalsCard()) {
      newSortedOffers = this._accOffers.filter((offer) => ((offer.bannerType !== 'metas-saving-goals') && (this.get('config.product.productId', offer) !== '0785')));
    } else if (this._existOfferPlan(this._accOffers)) {
      newSortedOffers = this._accOffers.filter((offer) => offer.bannerType !== 'metas-saving-goals');
    }
    this.set('_accOffers', [ ...newSortedOffers ]);
  }

  /**
   * Method to validate if the customer is an adult and has N4 or N2 acccount to show goals cards
   * @returns {Boolean}
   */
  _showGoalsCard() {
    const valueFlagGoals = this.get('value', this.featureFlagsCollection['glomo.pfm.goals']) || false;
    if (valueFlagGoals) {
      const valueFlagGoalsN2 = this.get('value', this.featureFlagsCollection['glomo.pfm.goalsN2']) || false;
      const { birthData } = this.globalCacheStorage;
      const { products } = (this.dashboardAccountsStorage && this.dashboardAccountsStorage.length > 0 ? this.dashboardAccountsStorage[0] : {});

      if (birthData && products) {
        const isAdult = this._isCustomerAdult(birthData);
        const hasN4Account = this._getN4Account(products);
        let hasN2Account = false;

        if (valueFlagGoalsN2) {
          hasN2Account = this._getN2Account(products);
        }
        return isAdult && (hasN4Account || hasN2Account);
      }
    }
    return false;
  }

  /**
   * Check if customer age is greater than or equal 18
   * @param {Object} customer
   * @returns {Boolean}
   */
  _isCustomerAdult(customer) {
    const { birthDate } = customer;
    /* global moment */
    const customerAge = moment().diff(birthDate, 'years');
    return customerAge >= 18;
  }

  /**
   * Check if customer has a level 04 account
   * @param {Array} accounts
   * @returns {Boolean}
   */
  _getN4Account(accounts) {
    return accounts.some(account => account.meta ? Number(account.meta.accountLevel) === 4 : Number(account.level) === 4);
  }

  /**
   * Check if customer has a level 02 account
   * @param {Array} accounts
   * @returns {Boolean}
   */
  _getN2Account(accounts) {
    return accounts.some(account => account.meta ? Number(account.meta.accountLevel) === 2 : Number(account.level) === 2);
  }

  /**
   * Check if the Plan offer exists in the service offers response
   * @param {Array} offers
   * @returns {Boolean}
   */
  _existOfferPlan(offers) {
    return offers.some(offer => (this.get('config.product.productId', offer) === '0785'));
  }

  /**
   * Check if the Promissory note offer exists in the service offers response
   * @param {Array} offers
   * @returns {Boolean}
   */
  _existOfferPromissory(offers) {
    const flagDepositDynamicOffer = this.get('value', this.featureFlagsCollection['glomo.investments.depositDynamicOffer']) || false;
    if (flagDepositDynamicOffer) {
      return offers.some(offer => (this.get('config.product.productId', offer) === '0786'));
    } else {
      return false;
    }
  }

  /**
   * Check if the Founds offer exists in the service offers response
   * @param {Array} offers
   * @returns {Boolean}
   */
  _existOfferFounds(offers) {
    const flagFoundsDynamicOffer = this.get('value', this.featureFlagsCollection['glomo.investments.ocFundsDynamicOffer']) || false;
    if (flagFoundsDynamicOffer) {
      return offers.some(offer => (this.get('config.product.productId', offer) === '0787'));
    } else {
      return false;
    }
  }
}

customElements.define(GlomoCampaignsDmMx.is, GlomoCampaignsDmMx);
