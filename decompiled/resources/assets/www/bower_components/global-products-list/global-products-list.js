'use strict';
class GlobalProductsList extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior
], Polymer.Element) {

  static get is() {
    return 'global-products-list';
  }
  static get properties() {
    return {
      /**
       * Product groups
       */
      productsList: Array,
      /**
       * Parsed data for product groups
       */
      _parsedProductsList: {
        type: Array,
        computed: '_computeParsedProductList(productsList)'
      },
      /**
       * Additional Product groups (accounts -> cards, cards -> accounts)
       */
      additionalProductsList: Array,
      /**
       * Visible char description
       */
      visibleChars: Number,
      /**
       * Field name to group by
       */
      groupBy: String,
      /**
       * Notify event on click item
       */
      notifyEvent: String,
      /**
       * If has error on get products
       */
      error: {
        type: Boolean,
        value: false
      },
      /**
       * If has external products
       */
      hasExternalProducts: {
        type: Boolean,
        value: false
      },
      /**
       * Started product, after load first content
       */
      started: {
        type: Boolean,
        reflectToAttribute: true
      },
      /**
       * Show loading zone
       */
      loaded: {
        type: Boolean,
        value: false
      },
      /**
       * Auto hide loading zone on set productsList
       */
      autoHideLoading: Boolean,
      /**
       * Status icons
       * ```
       * {
       *   locked: 'coronita:block',
       *   activate: 'coronita:clock',
       *   off: 'coronita:on'
       * }
       * ```
       */
      statusIcons: Object,
      /**
       * Status name of show overlay product
       */
      statusOverlay: {
        type: String,
        value: 'ACTIVATED'
      },
      /**
       * Show sticker text in first child of a card
       */
      showSticker: Boolean,
      /**
       * Url of the default image of the card.
       * Used if there is an error on loading the 'imageSrc'.
       */
      defaultImage: {
        type: String,
        value: ''
      },
      /**
       * Url of the default BBVA logo for external product.
       * Used to distinguish BBVA products from external products.
       */
      bbvaLogo: {
        type: String,
        value: './images/bbva.svg'
      },
      /**
       * hide or show bbva logo for bbva accounts.
       */
      hideBbvaLogo: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to  indicate if the class 'blocked' apply by default
       * To do not paint 'BLOCKED' products with gray
       */
      classBlockedGray: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to indicate statusdescription below
       */
      statusDescriptionBelow: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },
      /**
       * Class for setting the skeleton position
       */
      skeletonPositionClass: {
        type: String,
        value: 'fadein'
      },
      /**
       * Translation key to show when error
       */
      errorHeaderKey: {
        type: String,
        value: ''
      },
      /**
       * Icon size of the overlay image
       */
      imgOverlayIconSize: {
        type: Number,
        value: 24
      },
      /**
       * Set to true to set name in one line
       */
      nameOneLine: {
        type: Boolean,
        value: false
      },
      /**
       * define the locale for i18 dates purposes
       *
       * @type String
       */
      locale: {
        type: String
      },
      /**
       * Expiration date format
       * @type String
       */
      expirationDateFormat: {
        type: String,
        value: 'DD MMM YYYY'
      },
      /**
       * Tags that have to have word 'Saldo' before
       */
      tagToAddText: {
        type: Array,
        value: () => [ 'Disponible' ]
      },
      /**
      * Indicates which family of products has provoked an error.
      * Only apply when error
      */
      familyOnError: {
        type: String
      },
      /**
       * Param for emergency zone
       */
      continue: {
        type: String,
        value: ''
      },
      /**
       * Bind name of class for cells-atom-amount
       */
      amountSubheaderClass: {
        type: String
      },
      /**
       * Accesibility role to inform about what cells-product-item label is
       */
      roleLabel: {
        type: String
      },
      /**
       * Prevents a default text if it is not defined
       */
      withoutDefaultInfoTextChild: {
        type: Boolean,
        value: false
      },

      expirationDateText: {
        type: String,
        value: 'cells-global-dashboard-deposits-expiration-date'
      },
      /**
       * Amount's local currency.
       */
      localCurrency: String,
      /**
       * Button text of show masked amount
       */
      showButtonText: {
        type: String,
        value: 'cells-global-dashboard-header-button-show'
      },
      /**
       * Button text of hide masked amount
       */
      hideButtonText: {
        type: String,
        value: 'cells-global-dashboard-header-button-hide',
      },
      /**
       * Maximum request attempts for show alert error
       */
      maxRequestAttempts: {
        type: Number,
        value: 3,
      },
      /*
       * Counter for get retries on error response
       */
      requestAttempts: {
        type: Number,
        value: 0
      },
      /**
      * icon cofiguration to list link
      */
      valueButtonConfig: {
        type: Object,
      },
      /**
      * If true, then show error alert
      */
      alertError: {
        type: Boolean,
        vaue: false
      },
      /**
      * If true, then amounts become masked, regardless of individual product configuration.
      */
      forceMaskedAmount: {
        type: Boolean,
        value: false
      },
      /**
      * Configures the amount of masking characters that are going to be used in the amount components.
      */
      maskedAmountNumberChars: {
        type: Number,
        value: 5
      },

      /**
       * Flag to check if participantType should be take in account
       * @type {Boolean}
       */
      validateParticipantType: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to know if the platform is iOS
       * @type {Boolean}
       */
      isNativeIos: {
        type: Boolean,
        value: false
      },
      /**
       * It sets if amount will have separated cents or not
       */
      isDetailedCentsAmount: {
        type: Boolean,
        value: false
      },
      /**
       * It sets if product item's aria-label will include all details or not
       */
      isDetailedProductsAriaLabel: {
        type: Boolean,
        value: false
      },
      /**
       * It sets if products header aria-label will include currency characters or not
       */
      isCurrencyCharacterRemoved: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to show link of bottom list products
       * @type {Boolean}
       */
      showLinkBottom: {
        type: Boolean,
        value: false
      },
      /**
       * Product currency where show bottom link
       * @type {Boolean}
       */
      currencyLinkBottom: {
        type: String,
        value: ''
      },
      /**
       * Link bottom title text
       */
      linkBottomTitleText: {
        type: String,
        value: 'global-product-list-link-bottom-title-text'
      },
      /**
       * Determines id to dispatch meta-account-item-tap event
       */
      metaAccountTypeId: {
        type: String,
        value: 'ME'
      },

      /**
       * Determines the classification level to identify account meta in co
       */
      metaClassificationLevelCode: {
        type: String,
        value: '0026'
      },

      /**
       * If true, dont show bottom link.
       * If the user has a CTS account, it will be the last in the array.
       */
      _hasCTSProduct: {
        type: Boolean,
        value: false,
        computed: '_getCTSProduct(_parsedProductsList)'
      },
      /**
       * Index of product list to show bottom link
       */
      _hasIndexToShowLinkBottom: {
        type: Number,
        value: -1,
        computed: '_getindexProduct(_parsedProductsList)'
      },
      /**
      * Determines bank image alternative text for screen readers
      */
      bankImageAltText: String
    };
  }

  static get observers() {
    return [ '_checkedLoading(productsList)' ];
  }

  /**
   * Show error on getting products
   */
  _showLoadingError(error, productsList) {
    return error && !productsList;
  }

  /**
   * Handle masked amount
   */
  _computeMasking(forceMaskedAmount, individualProductMasking) {
    return forceMaskedAmount || individualProductMasking;
  }

  /**
   * Reset productsList
   */
  reset() {
    this.set('productsList', []);
    this.started = this.loaded = this.alertError = this.error = false;
  }

  /**
   * Regreshing edited product
   */
  refreshingProduct() {
    this.loaded = false;
    this.autoHideLoading = true;
  }

  /**
   * Show message on error products list
   */
  notifyError(family) {
    this.loaded = true;
    this.error = true;
    this.familyOnError = family;
  }

  /**
   * Show message on error products list
   */
  setLoaded() {
    this.loaded = true;
  }

  /**
   * Notify event on click refresh button
   */
  _notifyRefreshProducts() {
    this.requestAttempts++;
    this.started = this.loaded = this.alertError = this.error = false;
    this.dispatchEvent(new CustomEvent('refresh-products-list', {
      bubbles: true,
      composed: true,
      detail: this.familyOnError
    }));
    this.familyOnError = '';
  }

  /**
   * Notify event on click product link bottom
   */
  _notifyLinkBottom() {
    this.dispatchEvent(new CustomEvent('product-link-bottom-clicked', {
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Compute the error message based on the number of request attempts
   * @param {Number} requestAttempts
   */
  _computeErrorMessage(requestAttempts) {
    return (requestAttempts < this.maxRequestAttempts)
      ? 'global-products-list-error-load-content' : 'global-products-list-error-max-request';
  }

  /**
   * If true, show the button in error alert
   * @param {Number} requestAttempts
   * @returns {Boolean}
   */
  _computeErrorButton(requestAttempts) {
    return requestAttempts >= this.maxRequestAttempts;
  }

  /**
   * If alertError is true, remove the padding from the products
   * @param {Boolean} alertError
   * @returns {String}
   */
  _fixedPadding(alertError) {
    return alertError ? 'remove-padding' : '';
  }

  /**
   * Sort filter
   */
  _sortGroupsOfProducts(groupA, groupB) {
    return groupA.order - groupB.order;
  }

  /**
   * Checked overlay status
   */
  _getProductOverlay(product) {
    return product.status !== this.statusOverlay;
  }

  /**
   * Set icon overlay
   */
  _setProductOverlayIcon(product) {
    return this.statusIcons && product ? this.statusIcons[product.status] : false;
  }

  /**
   * Return text child
   */
  _setInfoTextChild(product) {
    if (product && product.infoTextChild) {
      return this.t(product.infoTextChild);
    }
    return this.t('cells-global-dashboard-cards-child-' + (product.isFirstChild && this.showSticker ? 'sticker' : 'aditional'));
  }

  /**
   * Computed icon and return icon
   */
  _computeProductIcon(icon) {
    icon = icon && icon.split(':');
    return icon && icon.length && icon[1];
  }

  /**
   * Product Billing Period
   */
  _getProductBillingPeriod(product) {
    return (product.originalProduct && product.originalProduct.cardType
      && product.originalProduct.cardType.id === 'CREDIT_CARD') ? 'OPEN_PERIOD' : '';
  }


  /**
   * Extract data from click event
   * @param {Object} ev
   * @returns {Object}
   */
  __getDataEvent({ id, simpleCode, group, billingPeriod, subProductType, isAdditionalCard, number, cardParticipantType, selector, alternativeDestinationEvent, productType, type }) {
    const productData = this._getSelectedItem(id, this._parsedProductsList);
    return {
      productId: id,
      simpleCode,
      billingPeriod,
      eventName: group ? group + '-item-tap' : (type ? type : this.notifyEvent),
      subProductType: this.c(subProductType, 'id', subProductType),
      isAdditionalCard: isAdditionalCard === 'true' ? 'additional-' : '',
      productNumber: number,
      cardParticipantType,
      alternativeDestinationEvent,
      digitalCardAssociated: this._getDigitalCardAssociated(productData),
      selectorData: this._getSelectorData(selector),
      productType
    };
  }

  /**
   * Notify on click product
   * @param {Object} ev
   */
  _onProductItemTap(ev) {
    let {
      productId,
      billingPeriod,
      eventName,
      subProductType,
      isAdditionalCard,
      productNumber,
      cardParticipantType,
      digitalCardAssociated,
      selectorData,
      alternativeDestinationEvent,
      productType
    } = this.__getDataEvent(this.c(ev, 'currentTarget.dataset'));
    if (productId) {
      const productSelected = this._getSelectedItem(productId, this.productsList);
      if (digitalCardAssociated) {
        this.dispatchEvent(new CustomEvent('notify-card-has-digital-associated', {
          detail: digitalCardAssociated,
          bubbles: true,
          composed: true
        }));
      }
      if (subProductType) {
        if (this.get('productId', productSelected) === this.metaAccountTypeId || this.get('classificationLevelCode', productSelected) === this.metaClassificationLevelCode) {
          eventName = 'meta-account-item-tap';
        } else {
          const subProductTypeEventName = subProductType.replace('_', '-').toLowerCase();
          const evtPreffix = alternativeDestinationEvent ? alternativeDestinationEvent : `${isAdditionalCard}${subProductTypeEventName}`;
          this.dispatchEvent(new CustomEvent(`${evtPreffix}-item-tap`, {
            detail: {
              productId: productId,
              cardType: subProductType,
              digitalCard: digitalCardAssociated,
              productType,
              ...cardParticipantType ? { cardParticipantType } : {}
            },
            bubbles: true,
            composed: true
          }));
        }
      }
      if (eventName) {
        const newDetail = this._getProductDetailOnItemTap(ev);
        this.dispatchEvent(new CustomEvent(eventName, {
          detail: newDetail,
          bubbles: true,
          composed: true
        }));
      }
      if (this.additionalProductsList) {
        this.dispatchEvent(new CustomEvent('related-additional-list', {
          detail: this.additionalProductsList,
          bubbles: true,
          composed: true
        }));
      }
      const deepClone = obj => typeof obj === 'undefined' ? undefined : JSON.parse(JSON.stringify(obj));
      this.dispatchEvent(new CustomEvent('selected-product', {
        detail: {
          product: deepClone(productSelected)
        },
        bubbles: true,
        composed: true
      }));
    }
  }
  /**
   * Make the detail of the event on item tap
   * If the isNativeIos flg is true add properties for the navigation to the account detail on iOS
   * @param {*} ev
   * @returns {Object}
   */
  _getProductDetailOnItemTap(ev) {
    const {
      productId,
      simpleCode,
      billingPeriod,
      subProductType,
      productNumber,
      digitalCardAssociated,
      selectorData,
      eventName,
      productType
    } = this.__getDataEvent(this.c(ev, 'currentTarget.dataset'));
    const productSelected = this._getSelectedItem(productId, this.productsList);
    const accountNumber = (selectorData.length > 1) ? selectorData[1] : undefined;
    const accountToIOS = (accountNumber) ? `\u2022${accountNumber.substring(accountNumber.length - this.visibleChars, accountNumber.length)}` : undefined;
    const detail = {
      productId: productId,
      simpleCode,
      cardType: subProductType || 'CARD',
      cardNumber: productNumber,
      continue: this.continue,
      digitalCard: digitalCardAssociated,
      billingPeriod: billingPeriod,
      accountNumber,
      productName: (selectorData.length > 1) ? selectorData[0] : undefined,
      accountUpgradeType: this.c(productSelected, 'upgradeData.statusType'),
      accountUpgradeLimitDate: this.c(productSelected, 'upgradeData.dueDateToUpdate'),
      depositWithdrawalsEnabled: eventName === 'deposit-item-tap',
      productType,
      product: {
        alias: this.get('name', productSelected),
        name: this.get('name', productSelected),
        number: accountNumber,
        product: {
          id: this.get('productId', productSelected)
        }
      }
    };

    const detailIos = {
      account: accountToIOS,
      completeAccount: accountNumber,
      productType: 0,
      title: `${this.c(productSelected, 'alias')} ${accountToIOS}`
    };

    return (this.isNativeIos) ? Object.assign(detail, detailIos) : detail;
  }

  _getDigitalCardAssociated(productData) {
    let associatedDigitalCard;
    this.c(productData, 'relatedContracts', []).map(contract => {
      this._parsedProductsList.map(productList => {
        productList.products.map(product => {
          if (((product || {}).relatedContracts || []).find(relatedContract => relatedContract.contractId === contract.contractId && product.physicalSupport === 'VIRTUAL')) {
            associatedDigitalCard = product;
          }
        });
      });
    });
    return associatedDigitalCard;
  }

  /**
   * Returns an array with the alias and the contract number
   * @param {String} selector
   */
  _getSelectorData(selector) {
    return (selector || '').split(' - ');
  }

  /**
   * Returns the selected Item
   */
  _getSelectedItem(id, list) {
    let products = [];
    let selectedItem;

    if (id) {
      (list || []).forEach(item => {
        products = products.concat(item.products || []);
      });

      selectedItem = products.find(item => item.id === id);
    }

    return selectedItem;
  }

  /**
   * Parse amount and translate label
   */
  _parseAmount(amount, isDeposits) {
    if (amount && amount.label) {
      const tLabel = this.t(amount.label);
      const label = isDeposits
        ? this.t('cells-global-dashboard-deposits-available', '_Investment_')
        : (this.tagToAddText.includes(amount.label)
          ? this.t('global-products-list-amount-label', '__Saldo disponible__', { label: tLabel.toLowerCase() })
          : tLabel);

      if (this.isDetailedProductsAriaLabel) {
        const amountArray = this.isNativeIos ? this.get('amount', amount).toLocaleString({ style: 'currency', currency: this.locale }).split('.') : this.get('amount', amount).toString().split('.');
        const amountFraction = this.get('0', amountArray).replace('-', 'menos');
        const amountCentsUnformatted = this.get('1', amountArray) || '00';
        const amountCents = amountCentsUnformatted.length === 1 ? `${amountCentsUnformatted}0` : amountCentsUnformatted;
        const amountCurrency = this.get('currency', amount);
        const ariaLabel = `${this.t(`global-products-list-amount-aria-label-${amountCurrency}`, '', {label, amountFraction, amountCents})}`;
        return Object.assign({}, amount, { label, ariaLabel });
      }

      return Object.assign({}, amount, { label });
    }
    return amount;
  }

  /**
   * Method to go follow up
   * @param {Object} ev
  */

  _onClicklink() {
    this.dispatchEvent(new CustomEvent('go-to-follow-up', {
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Return expiration date parsed
   * @param {Date} expirationDate
   */
  /*global moment:writable */
  _parseExpirationDate(expirationDate) {
    let momentDate = moment(expirationDate, 'YYYY-MM-DD');
    momentDate.locale(this.locale);
    const formatedDate = (this.expirationDateFormat === 'DD MMM YYYY')
      ? this._formatShortMonthDate(momentDate)
      : `${ momentDate.format(this.expirationDateFormat) }`;
    return `${ this.t(this.expirationDateText, 'Expiration') } ${ formatedDate }`;
  }

  /**
   * Returns expiration date aria label
   * @param {String} expirationDate
   */
  _expirationDateAriaLabel(expirationDate) {
    const date = moment(expirationDate).utc();
    const formattedDate = moment(date).format('LL');
    return `${ this.t(this.expirationDateText, 'Expiration') } ${ formattedDate }`;
  }

  _parseLastUpdatedDate(lastUpdatedDate) {
    let momentDate = moment(lastUpdatedDate, 'YYYY-MM-DD HH:mm:ss');
    const formatedDate = `${ momentDate.fromNow() }`;
    return `${ formatedDate.charAt(0).toUpperCase() + formatedDate.slice(1) }`;
  }

  /**
   * Return date parsed with DD MMM YYYY format with first letter capitalized
   * @param {Date} date
   */
  _formatShortMonthDate(date) {
    const day = date.format('DD');
    const month = date.format('MMMM').charAt(0).toUpperCase() + date.format('MMMM').slice(1, 3);
    const year = date.format('YYYY');
    return `${ day } ${ month } ${ year }`;
  }

  /**
   * Get class status
   */
  _getClassStatus(ClassStatus) {
    let _ClassStatus = (typeof ClassStatus === 'object' ? ClassStatus.id : ClassStatus || '').toLowerCase();
    return (_ClassStatus === 'blocked' || _ClassStatus === 'frozen') && !this.classBlockedGray ? '' : _ClassStatus;
  }

  _getClassProductName() {
    return this.nameOneLine ? 'name-one-line' : '';
  }

  /**
   * Get 'enable-primary-amount-negative' from class list if not found returns null character
   * @returns {String}
   */
  _getClassEnablePrimaryAmountNegative() {
    const classList = [ ...this.classList.valueOf() ];
    return classList.find((className) => className === 'enable-primary-amount-negative') || '';
  }

  /**
   * Get 'fixed-card-overlay-image-angle' from class list if not found returns null character
   */
  _getClassCardOverlayImageAngle() {
    return this.classList.contains('fixed-card-overlay-image-angle') ? 'fixed-card-overlay-image-angle' : '';
  }

  /**
   * Checked Values
   */
  _checkedLoading(productsList) {
    if (!this.started) {
      this.started = true;
    }
    if (this.autoHideLoading) {
      this.loaded = productsList && productsList.length >= 0 && !this.error;
    }
  }

  /**
   * Check if card is additional
   * @param {Object} product
   * @returns
   */
  _checkIfAdditional(product) {
    let indicators = this.c(product, 'indicators', this.c(product, 'detail.indicators', []));
    const validIndicator = (indicators.find(element => element.id === 'IS_ADDITIONAL') || {}).isActive;
    const authorizedParticipant = this.c(product, 'participant.participantType.id', '') === 'AUTHORIZED';
    return validIndicator || (this.validateParticipantType && authorizedParticipant);
  }


  /**
   * Pre-process product data for faster visualization
   * @param {Array} productsList
   * @returns {Array}
   */
  _computeParsedProductList(productsList) {
    return (productsList || []).map(group => {
      const  valueButtonConfig = {'icon': 'coronita:forward'};
      const products = this.c(group, 'products', []);
      const loanCurrency = (this.get('headerTitle', group) || '').includes('loans') ? this.get('products.0.originalProduct.currencies.0.currency', group) : '';
      const productsCurrency = this.get('headerAmount.currency', group) || this.get('products.0.primaryAmount.currency', group) || loanCurrency;
      const isDeposits = this.c(group, 'headerTitle', '').includes('deposits');

      if (this.hasExternalProducts) {
        if (!group?.headerTitle?.endsWith('-aggregated')) {
          group.headerTitle += '-aggregated';
        }
        if (!group?.headerTitleAriaLabel?.endsWith('-aggregated')) {
          group.headerTitleAriaLabel += '-aggregated';
        }
      }

      group.classCardCover = this._getClassCardOverlayImageAngle();
      const productListParsed =  {...group, ...{
        valueButtonConfig,
        maskedAmount: group.showMaskedAmount,
        products: products.map(product => this.__parseProduct(product, isDeposits))
      },
      headerCurrency: productsCurrency
      };
      return productListParsed;
    });
  }

  /**
   * Parse selected product from list
   * @param {Object} product
   * @param {Boolean} isDeposits
   * @returns {Object}
   */
  __parseProduct(product, isDeposits) {
    const cardParticipantType = this.c(product, 'cardParticipantType');
    const alternativeDestinationEvent = `${this.c(product, 'alternativeDestinationEvent', '')}`;
    return {
      name: product.name,
      nameAriaLabel: this.get('nameAriaLabel', product),
      description: product.description,
      primaryDescription: product.primaryDescription,
      primaryAmount: this._parseAmount(product.primaryAmount, isDeposits) || null,
      primaryAmountClass: `${ product.primaryAmountClass || 'amount-large' }`,
      secondaryAmount: this._parseAmount(product.secondaryAmount, isDeposits) || null,
      secondaryAmountClass: `${ product.secondaryAmountClass || '' }`,
      imgSrc: product.imgSrc || null,
      showImgOverlay: this._getProductOverlay(product),
      imgOverlayIcon: this._setProductOverlayIcon(product),
      id: product.id,
      dataBillingPeriod: this._getProductBillingPeriod(product),
      dataSelector: `${ product.name || '' } - ${ this.c(product.description, 'value', '') }`,
      dataGroup: product.group,
      physicalSupport: product.physicalSupport,
      subProductType: product.subProductType,
      isDigitalCard: product.isDigitalCard || false,
      isAdditionalCard: `${this._checkIfAdditional(product)}`,
      isCTS: product.isCTS || false,
      className: this.__getClassName(product),
      status: product.status,
      relatedContracts: product.relatedContracts,
      number: product.number,
      productType: this._getProductType(product),
      productId: this.get('product.id', product),
      simpleCode: this.get('simpleCode', product),
      ...alternativeDestinationEvent ? { alternativeDestinationEvent } : {},
      ...cardParticipantType ? { cardParticipantType } : {},
      ...this._getItemContent(product)
    };
  }

  /**
   *
   * @param {String} statusClassName
   * @param {Boolean} isChildClass
   * @param {Boolean} isFirstChildClass
   * @param {String} className
   * @returns {String}
   */
  __getClassName({status: statusClassName, isChildClass, isFirstChildClass, className}) {
    return `${ this._getClassStatus(statusClassName) } ${ isChildClass || '' } ${ isFirstChildClass || '' } ${ this._getClassProductName() } ${ this._getClassEnablePrimaryAmountNegative() } ${ className || '' }`;
  }

  /**
   * Shows BBVA logo
   * @param {Object} product
   * @returns {Boolean}
   */
  _showBbvaLogo(product) {
    return this.hasExternalProducts && !product.productType && !product.isChildClass && !this.hideBbvaLogo;
  }

  /**
   * product item content
   */
  _getItemContent(product) {
    const {
      icon = null,
      simpleNumber = null,
      isChild = null,
      bankImage = null,
      lastUpdateDate = null,
      statusdescription = null,
      statusLabel = null,
      expirationDate = null,
      additionalList = []
    } = product;
    const mapAdditionalList = (mapItem) => Object.assign(mapItem, {
      label: this.t(mapItem.label),
      expirationDateAriaLabel: this._expirationDateAriaLabel(moment(mapItem.value, 'DD MMM YYYY'))
    });

    return Object.assign({},
      icon && {
        icon,
        iconClassName: `icons icon-${ this._computeProductIcon(icon) } icon-size-18`
      },
      simpleNumber && { simpleNumber },
      isChild && this._getContentChild(product),
      bankImage && { bankImage },
      this._showBbvaLogo(product) && { bankImage: this.bbvaLogo },
      lastUpdateDate && {
        lastUpdateDate: this._parseLastUpdatedDate(lastUpdateDate)
      },
      statusdescription && {
        statusdescription: this.t(statusdescription),
        positionStatusDescription: this._positionStatusDescription(product.statusposition),
        positionStatusDescriptionClassName: `text-right-image status ${ product.status }`,
      },
      statusLabel && {
        statusLabel,
        statusLabelClassName: `text-below-image status ${ this.c(statusLabel, 'id', '') }`,
      },
      expirationDate && {
        expirationDate: this._parseExpirationDate(expirationDate),
        expirationDateAriaLabel: this._expirationDateAriaLabel(expirationDate),
        positionExpirationDate: this._positionExpirationDate(product.expirationDatePosition)
      },
      additionalList.length && {
        additionalList: additionalList.map(mapAdditionalList)
      }
    );
  }

  /**
   * Get Content child
   * @param {Object} product
   * @returns {{isChild: boolean, infoTextChild?: String}}
   * @private
   */
  _getContentChild(product) {
    return {
      isChild: true,
      ...((product.infoTextChild || !this.withoutDefaultInfoTextChild) && { infoTextChild: this._setInfoTextChild(product) })
    };
  }

  /**
   * Get Product Type
   * @param {Object} product
   */
  _getProductType(product) {
    return this.get('originalProduct.productType', product) || this.get('productType', product);
  }

  /**
   * Checked Value
   */
  _checkedValue(value) {
    return !!value;
  }

  _positionExpirationDate(expirationDatePosition) {
    return ['text-below-image', 'text-right-image', 'preLink'].includes(expirationDatePosition) ? expirationDatePosition : 'text-below-image';
  }

  /**
   * Get Position to statusDescription
   */
  _positionStatusDescription(statusposition) {
    return ['text-below-image', 'text-right-image', 'preLink'].includes(statusposition) ? statusposition : (this.statusDescriptionBelow ? 'text-below-image' : 'text-right-image');
  }

  /**
   * Returns key for screen-reader-only component
   * @param {Object} product
   */
  _screenReaderOnlyMessageKey(product) {
    const currency = this.isDetailedProductsAriaLabel ? this.get('headerCurrency', product) : this.get('headerAmount.currency', product);
    return `global-products-list-header-title-amount-${ currency }`;
  }

  /**
   * Returns the object the screen-reader-only component needs
   * @param {Object} product Contains the title, amount and the currency to be formated
   */
  _screenOnlyDataFormat(product) {
    const headerAmount = this.get('headerAmount', product);
    const headerTitle = this.isCurrencyCharacterRemoved ? this.get('headerTitleAriaLabel', product) : this.get('headerTitle', product);
    return [{
      key: 'amount',
      type: 'currency',
      isDetailedCentsAmount: this.isDetailedCentsAmount,
      isIosFormattedNumbers: this.isNativeIos,
      value: headerAmount
    },
    {
      key: 'text',
      type: 'text',
      value: headerTitle
    }];
  }

  /**
   * Returns aria-label for header product
   * @param {Object} product
   */
  _ariaLabelHeader(product) {
    const currency = this.isDetailedProductsAriaLabel ? this.get('headerCurrency', product) : this.get('headerAmount.currency', product);
    const productName = this.isCurrencyCharacterRemoved ? this.t(this.get('headerTitleAriaLabel', product)) : this.t(this.get('headerTitle', product));
    return this.t(`global-products-list-header-title-${ currency ? currency : 'no-currency' }`, '', { product: productName });
  }

  /**
   * Returns aria-label for product item, selecting data to be announced by the screen reader according to each product's type and data
   * @param {Object} product
   */
  _ariaLabelProductItem(product) {
    const productItem = this.isCurrencyCharacterRemoved ? this.get('nameAriaLabel', product) : this.t(this.get('name', product));
    const subProductType = this.get('subProductType', product) || '';
    const currency = this._ariaLabelProductCurrency(product, subProductType);
    const description = this.get('description.value', product) || '';
    const productNumber = this._ariaLabelProductNumber(this.get('description.valueAriaLabel', product));
    const showChars = description.length - this.visibleChars;
    const endingNumber = this._ariaLabelEndingNumber(description.slice(showChars));
    const lineAvailable = this._ariaLabelAmount(product, 'primaryAmount', subProductType, false);
    const creditLimit = this._ariaLabelAmount(product, 'secondaryAmount', subProductType, false);
    const lineAvailableLabel = this._ariaLabelAmount(product, 'primaryAmount', subProductType, true);
    const creditLimitLabel = this._ariaLabelAmount(product, 'secondaryAmount', subProductType, true);
    const expirationDate = this.get('expirationDateAriaLabel', product) || this.get('additionalList.0.expirationDateAriaLabel', product) || '';
    const lastUpdateDate = this._ariaLabelLastUpdateProduct(this.get('lastUpdateDate', product));
    const applicant = this.get('infoTextChild', product) || '';
    return this.t(`global-products-list-item-${ currency }`, '', {
      productItem,
      productNumber,
      ending: description.slice(showChars),
      endingNumber,
      status: this._ariaLabelProductStatus(product),
      lineAvailable,
      lineAvailableLabel,
      creditLimit,
      creditLimitLabel,
      expirationDate,
      lastUpdateDate,
      applicant
    });
  }

  /**
   * Returns the aria label for the ending number of a global products list item.
   * @param {string} endingLabel - The ending label to be included in the aria label.
   * @returns {string} The aria label for the ending number.
   */
  _ariaLabelEndingNumber(endingLabel) {
    return this.t('global-products-list-item-ending', '', {
      endingLabel
    });
  }

  /**
   * Returns a string. Default value is added to the "currency" property. The default value will be the local currency.
   */
  _getCurrencyFromProduct(product) {
    return this.get('primaryAmount.currency', product) || this.localCurrency;
  }

  /**
   * Returns detailed product number aria-label, according to its type
   */
  _ariaLabelProductNumber(descriptionAriaLabel) {
    if (descriptionAriaLabel && this.isDetailedProductsAriaLabel) {
      const numberLabel = this.t(this.get('numberLabel', descriptionAriaLabel));
      const number = this.get('number', descriptionAriaLabel);
      return `${numberLabel} ${number}`;
    }
    return '';
  }

  /**
   * Returns product currency for aria-label or just 'DEBIT' string
   */
  _ariaLabelProductCurrency(product, subProductType) {
    if (this.isDetailedProductsAriaLabel) {
      return this.get('primaryAmount.currency', product) || 'no-currency';
    }
    return subProductType === 'CREDIT_CARD' ? this.get('primaryAmount.currency', product) : 'DEBIT';
  }

  /**
   * Returns product primary or secondary amount aria-label
   */
  _ariaLabelAmount(product, typeOfAmount, subProductType, ifLabel) {
    if (this.isDetailedProductsAriaLabel) {
      return this.get(`${typeOfAmount}.ariaLabel`, product) || '';
    }
    if (subProductType === 'DEBIT_CARD') {
      return '';
    }
    const amountLabel = this.get(`${typeOfAmount}.label`, product) || '';
    const rawAmount = this.get(`${typeOfAmount}.amount`, product);
    const amount = (rawAmount !== undefined ? rawAmount : '').toLocaleString();
    if (ifLabel) {
      const currency = this.get(`${typeOfAmount}.currency`, product) ?? '';
      return amountLabel + ' ' + (currency ? this._ariaLabelAmountCurrency(amount, currency) : amount);
    }
    return amountLabel + ' ' + amount;
  }

  /**
   * Generates an ARIA label for the amount and currency.
   * @param {string} amount - The amount value.
   * @param {string} currency - The currency value.
   * @returns {string} The ARIA label for the amount and currency.
   */
  _ariaLabelAmountCurrency(amount, currency) {
    const [rawWholePart, rawDecimalPart] = amount.split('.');
    const wholePart = rawWholePart === '0' && rawDecimalPart ? '' : rawWholePart;
    const decimalPart = rawDecimalPart ? rawDecimalPart.padEnd(2, '0') : '';
    const labelWholePart = wholePart ? this._generateLabelAmount(wholePart, 'fraction', currency) : '';
    const labelDecimalPart = decimalPart ? this._generateLabelAmount(decimalPart, 'decimal', currency) : '';

    let labelKey = 'global-products-list-amount-summary';
    let labelParams = {};

    if (wholePart && decimalPart) {
      labelKey += `-${currency}-aria-label`;
      labelParams = { wholePart: labelWholePart, decimalPart: labelDecimalPart };
    } else if (wholePart) {
      labelKey += `-fraction-${currency}-aria-label`;
      labelParams = { wholePart: labelWholePart };
    } else {
      labelKey += `-decimal-${currency}-aria-label`;
      labelParams = { decimalPart: labelDecimalPart };
    }

    return this.t(labelKey, '', labelParams);
  }

  /**
   * Generates a label for the amount based on the given part, type, and currency.
   * @param {string} part - The part of the amount.
   * @param {string} type - The type of the amount.
   * @param {string} currency - The currency of the amount.
   * @returns {string} The generated label for the amount.
   */
  _generateLabelAmount(part, type, currency) {
    const intPart = parseInt(part.replace(',', ''));
    const key = intPart === 1
      ? `global-products-list-amount-${type}-${currency}-singular-aria-label`
      : `global-products-list-amount-${type}-${currency}-aria-label`;
    return this.t(key, '', { intPart });
  }

  /**
   * Returns product status aria-label
   */
  _ariaLabelProductStatus(product) {
    if (this.isDetailedProductsAriaLabel) {
      return this.get('statusdescription', product) || '';
    }
    return this.get('additionalList.0.label', product) || this.get('statusdescription', product) || '';
  }

  /**
   * Returns product last update date aria-label
   */
  _ariaLabelLastUpdateProduct(lastUpdateDate) {
    if (lastUpdateDate) {
      return this.t('global-products-list-last-update-aria-label', '', {lastUpdateDate});
    }
    return '';
  }

  /**
   * Returns alaternative text for product bank image
   * @param {Object} product
   */
  _getAltBankImageName(product) {
    return product.bankName || this.bankImageAltText;
  }

  /**
   * Method to toggle the masked amount
   * @param {Object} ev
   */
  _onClickToggleButton(ev) {
    const stateButton = ev.target.id;
    const headerTitle = ev.target.value;
    this.toggleMaskedAmount(headerTitle);
    if (stateButton === 'on') {
      this._dispatchShowBalances();
    }
  }

  /**
   * This method takes care of masking and unmasking the amounts.
   * @param {Object} headerTitle
   */
  toggleMaskedAmount(headerTitle) {
    const index = headerTitle ? this._parsedProductsList.findIndex(product => product.headerTitle === headerTitle) : 0;
    const products = Object.assign([], this.get(`${ index }.products`, this._parsedProductsList));
    const productWithoutBalances = products.filter(product => this.get('primaryAmount.amount', product) === undefined);
    if (productWithoutBalances.length === 0) {
      this.set(`_parsedProductsList.${ index }.maskedAmount`, !this.get(`${ index }.maskedAmount`, this._parsedProductsList));
    }
  }

  /**
   * This method is responsible for triggering an event that obtains the balances only of Equity and UnitLinked.
   * @event show-balances
   */
  _dispatchShowBalances() {
    this.dispatchEvent(new CustomEvent('show-balances', {
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Compute position for header amount
   * @param {*} maskedAmount
   */
  _computePositionHeaderAmount(maskedAmount) {
    return (maskedAmount) ? 'left' : '';
  }

  /**
   * This method shows error alert
   */
  showAlertError() {
    this.loaded = this.alertError = this.error = true;
  }

  /**
   * If true, it shows error when loading the product
   * @param {Boolean} error
   * @param {Boolean} alertError
   * @returns {Boolean}
   */
  _computeError(error, alertError) {
    return error && !alertError;
  }

  /**
   * If true, show product group list
   * @param {Object} productGroup
   * @returns {Boolean}
   */
  _showProductGroupList(productGroup) {
    return this.c(productGroup, 'products', []).length !== 0;
  }

  /**
   * If true, dont show bottom link
   * @param {Object} _parsedProductsList
   * @returns {Boolean}
   */
  _getCTSProduct(parsedProductsList) {
    const esCTS = parsedProductsList.find(e => this.c(e, 'products.0.isCTS', false));
    return !!esCTS;
  }

  _getindexProduct(parsedProductsList) {
    const indexCurrency = parsedProductsList.findIndex(e => this.get('headerAmount.currency', e) === this.currencyLinkBottom);
    return indexCurrency;
  }
  /**
   * Show link in the last element
   * @param {number} index
   * @returns {Boolean}
   */
  _showLinkBottom(index) {
    const value =  this._hasCTSProduct ? 2 : 1;
    return this.showLinkBottom && (this._hasIndexToShowLinkBottom === index || (this._hasIndexToShowLinkBottom === -1 && this._parsedProductsList.length - value === index));
  }
}


window.customElements.define(GlobalProductsList.is, GlobalProductsList);
