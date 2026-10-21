/* global moment */
/*eslint new-cap: [2, {"capIsNewExceptions": ["GlomoDiyModalMixin", "WithAccountBehavior", "i18nBehavior", "GlomoSpinnerHandlerBehavior", "GlomoFeedbackBehavior", "PropertyResetBehavior", "AmountBehavior", "WithPdfViewerBehavior", "GlomoAnalyticsManagerMixin", "GlomoAnalyticsManagerMixinStep"]}]*/
class GlomoNonPreapprovedCreditCardManager extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior,
  CellsBehaviors.CellsTextFormatterBehavior,
],
CellsBehaviors.AmountBehavior(Polymer.Element)) {

  static get is() {
    return 'glomo-non-preapproved-credit-card-manager';
  }
  static get properties() {
    return {

      /**
       * Stores product offerDetail
       */
      offerDetail: {
        type: Object,
        value: () => ({})
      },

      /**
       * Stores parsed card offer successful response
       */
      _parsedCardOfferSuccessfulResponse: {
        type: Object,
        value: () => ({})
      },

      /**
       * Stores images paths
       */
      images: {
        type: Object,
        value: () => ({})
      },
    };
  }

  /**
   * dispatch Events
   * @param {String} eventName
   * @param {Object} detail
   */
  _dispatchEvents(eventName, detail = {}) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }

  /**
   * Initializes npa credit card flow and invokes getCardOffer
   */
  initPage() {
    this._dispatchEvents('open-control-veil');
    this._dispatchEvents('get-card-offer', this.c(this.offerDetail, 'offerId'));
  }

  /**
   * Receives card offer successful response
   * @param {Object} cardOfferResponse
   */
  getCardOfferSuccessfulResponse(response) {
    if (response) {
      this._parsedCardOfferSuccessfulResponse = this._parseCardOfferSuccessfulResponse(response);
      this._amountSelected = this.c(this._parsedCardOfferSuccessfulResponse, 'cardSuggestedAmount');
      const moleculeHeaderConfig = this._setMoleculeHeaderConfig();
      const loanOfferProperties = this._setLoanOfferProperties(this._parsedCardOfferSuccessfulResponse);
      this._dispatchEvents('set-card-name-and-amount', this._parsedCardOfferSuccessfulResponse);
      this._dispatchEvents('set-loan-offer-properties', loanOfferProperties);
      this._dispatchEvents('set-header-properties', moleculeHeaderConfig);
      this._dispatchEvents('close-control-veil');
    }
  }

  /**
   * Parses card offer response
   * @param {Object} cardOfferResponse
   * @returns
   */
  _parseCardOfferSuccessfulResponse(cardOfferResponse) {
    return {
      cardImage: this.c(cardOfferResponse, 'image.url') || this.c(this.images, 'creditCardDollar'),
      cardImageClass: this.c(cardOfferResponse, 'image.url') ? 'small-image' : '',
      cardHeaderName: `${this.t('non-preapproved-credit-card-card-header-name')}${this._capitalizeStringManager(this.c(cardOfferResponse, 'details.product.name'))}`,
      cardName: `${this.t('non-preapproved-credit-card-custom-message-card-name-prefix')} ${this._capitalizeStringManager(this.c(cardOfferResponse, 'details.product.name'))}`,
      cardSuggestedAmount: this.c(cardOfferResponse, 'details.suggestedAmount.amount'),
      cardMaximumAmount: this.c(cardOfferResponse, 'details.maximumAmount.amount'),
      cardMinimumAmount: this.c(cardOfferResponse, 'details.minimumAmount.amount'),
      cardCat: this.getFormattedAmount(this.c(cardOfferResponse, 'rates.itemizeRates.0.itemizeRatesUnit.percentage'), 'MXN', 'MXN', 'es-mx', true, '.'),
      cardAnnuity: this.getFormattedAmount(this.c(cardOfferResponse, 'rates.itemizeRates.1.itemizeRatesUnit.amount'), 'MXN', 'MXN', 'es-mx', true, '.', true),
      cardRate: this.getFormattedAmount(this.c(cardOfferResponse, 'rates.itemizeRates.2.itemizeRatesUnit.percentage'), 'MXN', 'MXN', 'es-mx', true, '.'),
      cardPointsPercentage: this.c(cardOfferResponse, 'rates.itemizeRates.3.itemizeRatesUnit.percentage'),
      date: this.c(cardOfferResponse, 'rates.itemizeRates.0.calculationDate') ? this._formatDateToEs(this.c(cardOfferResponse, 'rates.itemizeRates.0.calculationDate')) : '',
      finalDate: this.c(cardOfferResponse, 'rates.itemizeRates.0.calculationDate') ? this._formatDateToEs(this._setFinalDate(this.c(cardOfferResponse, 'rates.itemizeRates.0.calculationDate'))) : '',
      origin: this.c(cardOfferResponse, 'origin', 'CRM'),
      product: cardOfferResponse?.details?.product?.id || '',
      relatedContracts: cardOfferResponse?.details?.relatedContracts[0]?.contractId || '',
    };
  }

  /**
   * Splits text by blank spaces and rejoins them after capitalization
   * @param {String} text
   */
  _capitalizeStringManager(text) {
    const capitalizedTexts = [];
    const splittedText = text ? text.split(/\s+/) : [];
    splittedText.pop();
    splittedText.shift();
    splittedText.forEach(el => capitalizedTexts.push(this.capitalize(el)));
    return capitalizedTexts.join(' ');
  }

  /**
   * @desc Set final date CAT
   */
  _setFinalDate(date) {
    return moment(date).add(180, 'days');
  }

  /**
   * @desc Get yyyy-mm-dd format and exctract year, month and day separately
   * @param date
   */
  _formatDateToEs(date) {
    moment.locale('es');
    return moment(date).format('DD [de] MMMM [de] YYYY');
  }

  /**
   * Sets offer detail values that will be shown on screen depending on card offer response
   * @param {Object} parsedResponse
   */
  _setLoanOfferProperties(parsedResponse) {

    const className = this.c(parsedResponse, 'origin') === 'CRM' ? 'fixed-amount' : 'dynamic-amount';
    const imageClass = this.c(parsedResponse, 'cardImageClass') ? '' : 'image-with-margin';

    const crmAmountData = {
      label: this.t('non-preapproved-credit-card-crm-amount-data-label'),
      amount: this.c(parsedResponse, 'cardSuggestedAmount'),
      classAmount: 'spacing-amount-input',
    };

    const altAmountData = {
      currencyCode: 'MXN',
      localCurrency: 'MXN',
      label: this.t('non-preapproved-credit-card-alt-amount-data-label'),
      language: 'MXN',
      iconSize: 'icon-size-26',
      iconCode: 'coronita:close',
      errorMessageIcon: 'coronita:alert',
      charMax: 10,
      amountDefault: this.c(parsedResponse, 'cardSuggestedAmount'),
      amountMin: this.c(parsedResponse, 'cardMinimumAmount'),
      amountMax: this.c(parsedResponse, 'cardMaximumAmount')
    };

    const data = {
      className: `non-preapproved-credit-card ${className} ${imageClass}`,
      hideContent: false,
      amountSelected: this.c(parsedResponse, 'cardSuggestedAmount'),
      language: 'es-mx',
      localCurrency: 'MXN',
      currencyCode: 'MXN',
      active: true,
      enableSticky: false,
      headerColor: 'header-core-blue',
      autoFormat: true,
      sliderProperty: false,
      messageInfo: false,
      disableDecimal: false,
      hideDecimal: true,
      hideSecondaryButton: true,
      textButtonAccepted: 'non-preapproved-credit-card-bureau-continue-button',
      headerContent: {
        image: this.c(parsedResponse, 'cardImage'),
        headerTitle: this.t('non-preapproved-credit-card-header-content-header-title'),
        headerDescription: this.c(parsedResponse, 'cardName'),
        class: `header-core-blue ${this.c(parsedResponse, 'cardImageClass')}`
      },
      mainText: {
        title: 'non-preapproved-credit-card-offer-main-text-title',
        description: this.c(parsedResponse, 'origin') === 'CRM' ? '' : this.t('non-preapproved-credit-card-main-text-description')
      },
      amountData: this.c(parsedResponse, 'origin') === 'CRM' ? {defaultData: crmAmountData} : altAmountData,
      principalList: [
        {
          title: 'non-preapproved-credit-card-offer-principal-list-title',
          class: 'medium-blue',
          icon: true,
          lists: [
            this.t('non-preapproved-credit-card-principal-list-digital-card'),
            this.t('non-preapproved-credit-card-principal-list-monthly-payments'),
            this.t('non-preapproved-credit-card-principal-list-rates')
          ]
        }
      ],
      keyInfo: [
        {
          title: this.t('non-preapproved-credit-card-key-info-comission-title'),
          keyValues: [
            {
              key: this.t('non-preapproved-credit-card-key-info-comission-key'),
              value: this.c(parsedResponse, 'cardAnnuity')
            }
          ]
        },
        {
          title: this.t('non-preapproved-credit-card-key-info-rates-key-title'),
          titleIcon: 'coronita:help',
          eventModal: '',
          keyValues: [
            {
              key: this.t('non-preapproved-credit-card-key-info-rates-key-text'),
              value: `${this.c(parsedResponse, 'cardRate')}%`,
              classInfoValue: 'values-bold'
            }
          ],
          division: true
        },
      ],
      customMessage: {
        message: `${this.t('non-preapproved-credit-card-custom-message-cat-start')}${this.c(parsedResponse, 'cardCat')}${this.t('non-preapproved-credit-card-custom-message-cat-end')}${this.c(parsedResponse, 'cardRate')}${this.t('non-preapproved-credit-card-custom-message-comission')}
        ${this.c(parsedResponse, 'cardAnnuity')}${this.t('non-preapproved-credit-card-custom-message-date-start')}${this.c(parsedResponse, 'date')}${this.t('non-preapproved-credit-card-custom-message-date-end')}${this.c(parsedResponse, 'finalDate')}${this.t('non-preapproved-credit-card-custom-message-end')}`,
        top: true,
        class: 'unpadded'
      },
      showButtonSticky: true,
    };

    return data;
  }

  /**
   * Sets values to annuity icon modal
   */
  setAnnuityIconModalProperties() {
    const modal = {
      heroImage: '',
      headerTitle: this.c(this._parsedCardOfferSuccessfulResponse, 'cardHeaderName'),
      acceptButton: this.t('non-preapproved-credit-card-bureau-accept-button-label'),
      icon: 'help',
      hideContentContainer: true,
      values: [
        {
          class: 'title-l  main-description-no-margin-top margin-none',
          title: this.t('non-preapproved-credit-card-annuity-modal-values-title'),
          text: this.t('non-preapproved-credit-card-annuity-modal-values-first-text'),
          hideImagesDiv: true
        },
        {
          class: 'margin-none main-description-no-margin-top',
          text: this.t('non-preapproved-credit-card-annuity-modal-values-second-text'),
          hideImagesDiv: true
        },
        {
          class: 'title-l margin-top-m main-description-no-margin-top margin-none',
          title: this.t('non-preapproved-credit-card-annuity-modal-cat-title'),
          text: this.t('non-preapproved-credit-card-annuity-modal-cat-first-text'),
          hideImagesDiv: true
        },
        {
          class: 'margin-none main-description-no-margin-top',
          text: this.t('non-preapproved-credit-card-annuity-modal-cat-second-text'),
          hideImagesDiv: true
        }
      ]
    };

    this._dispatchEvents('set-origin', 'annuityIconModal');
    this._dispatchEvents('set-credit-history-help-modal-properties', modal);
    this._dispatchEvents('open-credit-history-help-modal');
  }

  /**
   * This function throws a show-close-confirm event in order to show an alert exit message.
   */
  manageBackButton() {
    const detail = {
      code: 'NPA-CREDIT-CARD-MANAGER-EXIT',
      selectedConfig: {
        className: 'error exit',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'non-preapproved-credit-card-accept-back-button-label',
        cancelBtLabel: 'non-preapproved-credit-card-cancel-back-button-label',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert',
              class: 'spacing'
            },
            { text: 'non-preapproved-credit-card-back-button-message' }
          ]
        }
      }
    };

    this._dispatchEvents('show-close-confirm', detail);
  }

  /**
   * This function generates a show-close-confirm event to display a modal at the end of the flow.
   * @event show-close-confirm
  */
  proposalCreateSuccessModal() {
    this._dispatchEvents('close-control-veil');
    const infoModal = {
      code: 'NPA-PROPOSAL-SUCCESS',
      selectedConfig: {
        acceptBtLabel: 'glomo-loan-offer-alert-button-acept',
        openMaximized: true,
        className: 'full-height-error',
        title: 'Solicitud de tarjeta',
        heroImage: './images/activate-virtual-card.svg',
        template: {
          type: 'paragraphs',
          values: [
            {
              text: 'non-preapproved-consumer-loan-success-modal-title'
            },
            {
              text: 'non-preapproved-consumer-loan-success-modal-paragraph-two'
            }]
        }
      }
    };
    this._dispatchEvents('show-close-confirm', infoModal);
  }

  /**
   * Builds body with card offer response, offer detail and amount selected
   */
  onClickLoanOfferContinueButton() {
    const data =  {
      cardType: {
        id: 'CREDIT_CARD'
      },
      product: {
        id: '0SKY',
        subproduct: {
          id: this.get('product', this._parsedCardOfferSuccessfulResponse)
        }
      },
      physicalSupport: {
        id: 'NORMAL_PLASTIC'
      },
      grantedCredits: [
        {
          currency: 'MXN',
          amount: this._amountSelected,
        }
      ],
      relatedContracts: [
        {
          contractId: this.get('relatedContracts', this._parsedCardOfferSuccessfulResponse),
          numberType: {
            id: 'CCC'
          },
          product: {
            id: 'CREDITCARD',
            productType: {
              id: 'ACCOUNTS'
            }
          },
          relationType: {
            id: 'LINKED_WITH'
          }
        },
        {
          contractId: this.get('productId', this.offerDetail),
          numberType: {
            id: 'CCC'
          },
          product: {
            id: 'ACCOUNTS',
            productType: {
              id: 'ACCOUNTS'
            }
          },
          relationType: {
            id: 'LINKED_WITH'
          }
        }
      ]
    };
    this.setResetProperties();
    this._dispatchEvents('set-origin', 'clickContinueButton');
    this._dispatchEvents('send-credit-card-offer-to-new-page', data);
  }

  /**
   * Resets values shown on screen
   */
  setResetProperties() {
    const moleculeHeader = this._resetMoleculeHeader();

    this._dispatchEvents('set-loan-offer-properties', {
      hideContent: true,
      amountData: {}
    });
    this._dispatchEvents('set-header-properties', moleculeHeader);
  }

  /**
   * Sets properties to header
   */
  _setMoleculeHeaderConfig() {
    return {
      className: 'header--core',
      rightIcon: 'coronita:close',
      rightIconSize: '20',
      titleName: this.c(this._parsedCardOfferSuccessfulResponse, 'cardHeaderName')
    };
  }

  /**
   * Sets properties to molecule header
   */
  _resetMoleculeHeader() {
    return {
      className: '',
      rightIcon: '',
      rightIconSize: '',
      titleName: ''
    };
  }

  /**
   * Updates amount selected by the user
   * @param {Number} amount
   */
  updateCardOfferAmount(amount) {
    this._amountSelected = amount;
  }

  /**
   * Validates card offer response error
   * @param {Object} response
   */
  getCardOfferErrorResponse(response) {

    let errorModal = {};

    if (this.c(response, 'messages.0.message')) {
      const splittedMessage = this.c(response, 'messages.0.message').split('#');
      const errorResponseFunction = splittedMessage[0] === 'MPECA03' ? '_validatePaymentMethodsError' : '_setDefaultErrorModal';
      errorModal = this[errorResponseFunction](splittedMessage);
    } else {
      errorModal = this._setDefaultErrorModal();
    }

    this._dispatchEvents('open-with-config-modal-card-advice', errorModal);
    this._dispatchEvents('close-control-veil');
  }

  /**
   * Validates MPECA03 message
   * @param {Array} errorMessage
   */
  _validatePaymentMethodsError(errorMessage) {
    const paymentMessageError = errorMessage[1] === 'RERBUE00' ? '_setPastDueDebtModal' : '_setFinantialHealthModal';
    return this[paymentMessageError]();
  }

  /**
   * Returns past due debt modal
   */
  _setPastDueDebtModal() {
    return {
      fullHeight: true,
      code: 'CREDIT-CARD-NOT-POSSIBLE',
      headerTitle: this.t('non-preapproved-credit-card-modal-header-title'),
      closeIconIdRigth: 'coronita:close',
      imageUrl: this.c(this.images, 'requestCancelledImage'),
      titleText: this.t('non-preapproved-credit-card-key-past-due-debt-modal-title-text'),
      text: this.t('non-preapproved-credit-card-key-past-due-debt-modal-text'),
      configButtons: {
        buttons: {
          primary: {
            text: this.t('non-preapproved-credit-card-key-cards-error-modal-button-primary'),
            class: 'primary'
          }
        }
      },
      unfixed: true
    };
  }

  /**
   * Returns finantial health modal
   */
  _setFinantialHealthModal() {
    return {
      fullHeight: true,
      code: 'FINANTIAL-HEALTH-PLACE',
      headerTitle: this.t('non-preapproved-credit-card-modal-header-title'),
      closeIconIdRigth: 'coronita:close',
      imageUrl: this.c(this.images, 'requestCancelledImage'),
      titleText: this.t('non-preapproved-credit-card-finantial-health-modal-title-text'),
      text: this.t('non-preapproved-credit-card-finantial-health-modal-text'),
      linkIconText: this.t('non-preapproved-credit-card-finantial-health-modal-link-icon-text'),
      linkIcon: 'place',
      iconClass: 'icon-size-26 cells-molecule-link-icon--block icon-find-place',
      configButtons: {
        buttons: {
          primary: {
            text: this.t('non-preapproved-credit-card-key-cards-error-modal-button-primary'),
            class: 'primary'
          }
        }
      },
      unfixed: true
    };
  }

  /**
   * Returns default error modal
   */
  _setDefaultErrorModal() {
    return {
      fullHeight: true,
      code: 'KEEP-LOOKING-OFFER',
      headerTitle: this.t('non-preapproved-credit-card-modal-header-title'),
      closeIconIdRigth: 'coronita:close',
      imageUrl: this.c(this.images, 'noOffer'),
      titleText: this.t('non-preapproved-credit-card-default-error-modal-title-text'),
      text: this.t('non-preapproved-credit-card-default-error-modal-text'),
      configButtons: {
        buttons: {
          primary: {
            text: this.t('non-preapproved-credit-card-key-cards-error-modal-button-primary'),
            class: 'primary'
          }
        }
      },
      unfixed: true
    };
  }
}

customElements.define(GlomoNonPreapprovedCreditCardManager.is, GlomoNonPreapprovedCreditCardManager);
