/* global moment */
{
  /**
    `<glomo-account-manager>` Description.

    Example:

    ```html
    <glomo-account-manager></glomo-account-manager>
    ```

    ## Styling
    The following custom properties and mixins are available for styling:

    ### Custom Properties
    | Custom Property     | Selector | CSS Property | Value       |
    | ------------------- | -------- | ------------ | ----------- |
    | --cells-fontDefault | :host    | font-family  |  sans-serif |
    ### @apply
    | Mixins    | Selector | Value |
    | --------- | -------- | ----- |
    | --glomo-account-manager | :host    | {} |

    * @customElement glomo-account-manager
    * @polymer
    * @extends {Polymer.Element}
    * @demo demo/index.html
  */
  // eslint-disable-next-line
  class GlomoAccountManager extends CellsBehaviors.AmountBehavior(
    Polymer.mixinBehaviors(
      [
        CellsBehaviors.i18nBehavior,
        CellsBehaviors.CellsCheckNestedKeysBehavior,
      ],
      Polymer.Element
    )
  ) {
    static get is() {
      return 'glomo-account-manager';
    }

    static get properties() {
      return {
        /**
         * @description account loaded matched accounts and finantial overview service
         * @type {Object}
         */
        _accountSelected: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description flags for checks operatives
         * @type {Object}
         */
        _checksFeatureFlags: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description src for bank image account
         * @type {String}
         */
        bankImg: {
          type: String,
          value: ''
        },
        /**
         * @description accounts from dashboard or finantial overview
         * @type {Array}
         */
        dashboardAccounts: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description cards from dashboard or finantial overview
         * @type {Array}
         */
        dashboardCards: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description contains date format
         * @type {String}
         */
        dateFormat: {
          type: String,
          value: 'MMMM D, YYYY'
        },
        /**
         * max days since alertament when the account will be restricted
         **/
        daysToAddDueDate: {
          type: Number,
          value: 60
        },
        /**
         * @desciption flag for portability exist
         * @type {Boolean}
         */
        _existPortability: {
          type: Boolean,
          value: false
        },
        /**
         * @description flag for debit card exists
         * @type {Boolean}
         */
        _existRelatedDebitCard: {
          type: Boolean,
          value: false
        },
        /**
         * @description flag for credit card exists
         * @type {Boolean}
         */
        existCreditCard: {
          type: Boolean,
          value: false,
          notify: true
        },
        /**
         * @description contains the expands to make account request
         * @type {String}
         */
        expands: {
          type: String,
          value: ''
        },
        /**
         * @description flag to show swift code
         * @type {Boolean}
         */
        enableSwiftCode: {
          type: Boolean,
          value: false
        },
        /**
         * @description flags from glomo-settings
         * @type {Object}
         */
        featureFlags: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description account feature flags
         * @type {Object}
         */
        featureFlagCollection: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description keys for feature flags
         * @type {Array}
         */
        featureFlagCollectionKeys: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description indicator for checks request
         * @type {String}
         */
        indicatorId: {
          type: String,
          value: 'CHECK_PROTECTION'
        },
        /**
         * @description user phone number
         * @type {String}
         */
        phoneNumber: {
          type: String,
          value: ''
        },
        /**
         * @description get account retry attemps
         * @type {Object}
         */
        _getAccountAttemps: {
          type: Object,
          value: () => ({
            current: 0,
            max: 2
          })
        },
        /**
         * Include status description an status description message
         * @type Boolean
         */
        includeStatusDescription: {
          type: Boolean,
          value: false
        },
        /**
         * @description the page is loaded
         * @type {Boolean}
         */
        _initialized: {
          type: Boolean,
          value: false
        },
        /**
         * @description
         * @type {String}
         */
        localCurrency: {
          type: String,
          value: ''
        },
        /**
         * @description local storage data
         * @type {Object}
         */
        _localStorageValue: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description key for local storage data
         * @type {String}
         */
        localStorageKey: {
          type: String,
          value: ''
        },
        /**
         * @description flag if pockets should be updated
         * @type {Boolean}
         */
        _updatePockets: {
          type: Boolean,
          value: false
        },
        /**
         * @description pockets attemps
         * @type {Object}
         */
        _pocketsAttempts: {
          type: Object,
          value: () => ({
            current: 0,
            max: 2
          })
        },
        /**
         * @description src for pocket image
         * @type {String}
         */
        pocketImg: {
          type: String,
          value: ''
        },
        /**
         * @description contains the productId selected to make account request
         * @type {String}
         */
        _productIdSelected: {
          type: String,
          value: '',
        },
        /**
         * @description contains the product selected to make account request
         * @type {String}
         */
        _productSelected: {
          type: String,
          value: '',
        },
        /**
         * @description accounts from dashboard or finantial overview
         * @type {Array}
         */
        _mappedDashboardAccounts: {
          type: Array,
          value: () => [],
        },
        /**
         * @description if exist CLABE account save it
         * @type {Object}
         */
        _clabeAccount: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description portability list
         * @type {Array}
         */
        _portabilityList: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description limits for the current product. Used for upgdradeable accounts feature
         * @type {Object}
         **/
        productLimits: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description swift code
         * @type {String}
         */
        swiftCode: {
          type: String,
          value: ''
        },
        /**
         * Customer Id unmasked (MX)
         * @type {String}
         */
        clientId: {
          type: String,
          value: ''
        },
        /**
         * days elapsed contract
         * @type {Object}
         */
        daysElapsed: {
          type: Object,
          value: {
            one: 1,
            ten: 10,
            eleven: 11,
            sixty: 60
          }
        },
        /**
         * flag cryptograhy number account
         * @type {Boolean}
         */
        _flagCrypto: {
          type: Boolean,
          value: false
        },
        /**
         * number account encrypted
         * @type {String}
         */
        _cryptoNumberAccountData: {
          type: String,
          value: ''
        },
        /**
         * status contract
         * @type {Array}
         */
        statusContract: {
          type: Array,
          value: () => []
        },
        /**
         * Financial overview response
         * */
        financialOverviewResponse: {
          type: Object,
          value: () => ({})
        },
        /**
         * status Type
         * @type {Array}
         */
        statusType: {
          type: Array,
          value: () => ([])
        },
        /**
         * levels
         * @type {Array}
         */
        levels: {
          type: Array,
          value: () => ([])
        },
        /**
         * sub Product types
         * @type {Array}
         */
        subProductTypes: {
          type: Array,
          value: () => []
        },
        /**
         * codicel localstorage label
         * @type {String}
         */
        codicelKey: {
          type: String,
          value: 'codicel_entrypoint'
        },
        /**
         * Array that sabe accounts when add status item to current account in slider
         * @type {Array}
         */
        _accountsMapped: {
          type: Array,
          value: () => []
        },
        /**
         * campaigns offers
         * @type {Boolean}
         */
        _offers: {
          type: Boolean,
          value: false
        },
        /**
         * native config
         * @type {Boolean}
         */
        native: {
          type: Boolean,
          value: false
        },
        /**
         * Stand-In account
         * @type {Boolean}
         */
        standIn: {
          type: Boolean,
          value: false
        },
        /**
        * internalCode
        * @typeArray
        */
        isCodeSpei: {
          type: Array,
          value: () => ['950', '951']
        },
        /**
         * @description contains the product simple code selected to make transactions requests
         * @type {String}
         */
        _transactionsProductId: {
          type: String,
          value: ''
        },
        /**
         * @description flag of notification validation of pending documents
         * @type {Boolean}
         */
        upgradeCustomer: {
          type: Boolean,
          value: false,
        },
        /**
         * @description contains api-versions list for transactions
         * @type {String}
         */
        transactionsApiVersions: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description proactivity campaigns asociated to an account
         * @type {Array}
         */
        _proactivityCampaigns: {
          type: Array,
          value: () => ([])
        },
        /**
        * @description src for modal image account
        */
        fundsImage: {
          type: String,
          value: ''
        },
        /**
        * @desciption separator
        */
        separator: {
          type: String,
          value: ''
        },
        /**
        * @desciption visible chars
        */
        visibleChars: {
          type: Number,
          value: 0
        },
        /**
        * @desciption view more started
        */
        viewMoreStarted: {
          type: Boolean,
          value: false
        },
        /**
        * @description Validate that the account is digital
        * @type {Boolean}
        */
        digitalAccount: {
          type: Boolean,
          value: false
        },
        /**
        * @description Validate if the selected card is a business debit
        * @type {Boolean}
        */
        _isBusinessDebitCard: {
          type: Boolean,
          value: false
        },
        /**
        * @description subProductType id
        * @type {String}
        */
        subProductsType: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description accounts movements V2
         * @type {Boolean}
         */
        transactionsFeatureFlag: {
          type: Boolean,
          value: false
        },
        /**
         * @description pending status movements
         * @type {Boolean}
         */
        pendingTransactionsFeatureFlag: {
          type: Boolean,
          value: false
        },
        /**
         * @description digital cards from dashboard or finantial overview
         * @type {Array}
         */
        digitalCards: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description update data after operation
         * @type {Boolean}
         * @private
         */
        _updateDashboardAccount: {
          type: Boolean,
          value: false
        },
        /**
        * @description  validate type account for a message boost interbank transfers / cv currency
        * @type {String}
        */
        messageAccountSelected: {
          type: String,
          value: ''
        },
        /**
        * @description contains the boost interbank transfers flag
        * @type {Boolean}
        */
        _isFlagMessageInterbankTransfers: {
          type: Boolean,
          value: false
        },
        /**
        * @description contains the boost cv currency
        * @type {Boolean}
        */
        _isFlagMessageCVCurrency: {
          type: Boolean,
          value: false
        },
        /**
        * @description payload of notification Financial Healt
        * @type {Array}
        */
        payloadFinancialHealt: {
          type: Object,
          value: () => ({})
        },
        /**
        * @description Validates if the notification of boost international transfers is visible
        * @type {Boolean}
        */
        hiddenMessageInterbankTransfers: {
          type: Boolean,
          value: true
        },
        /**
        * @description contains the message title of boost international transfers
        * @type {String}
        */
        titleMessageInterbankTransfers: {
          type: String,
          value: ''
        },
        /**
        * @description contains the message text of boost international transfers
        * @type {String}
        */
        textMessageInterbankTransfers: {
          type: String,
          value: ''
        },
        /**
        * @description contains the message link of boost international transfers
        * @type {String}
        */
        linkMessageInterbankTransfers: {
          type: String,
          value: ''
        },
        /**
         * @description general event name for show alert manager
         * @type {String}
         */
        alertManagerModalEvent: {
          type: String,
          value: 'show-alert-manager-modal'
        },
        /**
         * @description dossiers status types allowed on backlog accounts to show warning banner
         * @type {Array}
         */
        backlogDossierStatusTypes: {
          type: Array,
          value: () => (['EXP02', 'EXP04'])
        },
        /**
         * @description levels allowed on update contract accounts to show warning banner
         * @type {Array}
         */
        updateContractAllowedLevels: {
          type: Array,
          value: () => (['04', '05'])
        },
        /**
         * @description stores account selected dossier state
         * @type {Object}
         * @private
         */
        _accountDossierStatus: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description Flag to indicate if it is initialized by pockets deeplink
         * @type {Boolean}
         * @private
         */
        _initPocketDeepLink: {
          type: Boolean,
          value: false
        },
        /**
         * @description Deeplink name for Pocket
         * @type {String}
         */
        keyPocketDeepLink: {
          type: String,
          value: 'pocketsRTG'
        },
        /**
         * @description stores account selected indicators state
         * @type {Array}
         * @private
         */
        _currentAccountIndicators: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description local storage data for give money value
         * @type {Object}
         */
        localStorageGiveMoneyValue: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description key for local storage data for give money
         * @type {String}
         */
        localStorageGiveMoneyKey: {
          type: String,
          value: 'giveMoney'
        },
        /**
         * @description accounts not operationals
         * @type {Array}
         */
        accountsNotOperationals: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description stores which flow must be used on link multistep update contract
         * @type {String}
         * @private
         */
        _updateContractWay: {
          type: String,
          value: ''
        },
        /**
         * @description flag to show icon and masked account number in product summary
         * @type {Boolean}
         */
        showIconAndMask: {
          type: Boolean,
          value: false
        },
        /**
         * @description response for customer records validations
         * @type {Object}
         */
        user: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description customer records status flag
         * @type {Boolean}
         */
        customerRecordsStatus: {
          type: Boolean,
          value: false
        },
        /**
         * @description query params for special dossier campaigns
         */
        dossierCampaignsParams: {
          type: Object,
          value: () => ({'label.id': 'MGCE'})
        },
        /**
        * Error code when the key doesn't exist in local storage
        * @type {Number}
        */
        _localStorageErrorCode: {
          type: Number,
          value: 999
        },
        /**
        * @description list documentaton dossiers response from dashboard
        * @type {Object}
        * */
        listDocumentationDossiers: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description store financial overview account id without additional data main id
         * @type {String}
         */
        currentAccountSimpleCode: {
          type: String,
          value: ''
        },
        /**
         * @description check if update contract has been made current day based on local storage flag
         * @type {Boolean}
         */
        updateContractHasBeenMadeToday: {
          type: Boolean,
          value: false
        },
        /**
         * @description List of participants by account detail
         * @type {Array}
         */
        participantsList: {
          type: Array,
          value: () => ([])
        },
        /**
         * @description Related contracts to the account v2
         * @type {Boolean}
         */
        relatedContractV2: {
          type: Boolean,
          value: false
        },
        /**
         * @description customers response
         * @type {Object}
         */
        customerResponse: {
          type: Object,
          value: () => ({})
        },
        /**
         * Flag to know if it is a minor's account
         * @type {Boolean}
         */
        isGlomoMiniorAccount: {
          type: Boolean,
          value: false
        },
        /**
         * Saved vale for local storage Evidences
         * @type {String}
         */
        evidencesStorage: {
          type: String,
          value: ''
        },
        /**
         * Flag for get request service
         * @type {Boolean}
         */
        getFlagEvidences: {
          type: Boolean,
          value: false
        },
        /**
         * Flag for documents dossiers service
         * @type {Boolean}
         */
        _featureFlagAccountsDocumentsDossiers: {
          type: Boolean,
          value: false
        },
        /**
         * List of client status types
         * @type {Array}
         */
        _statusTypes: {
          type: Object,
          value: () => ({
            incomplete: 'INCOMPLETE',
            blocked: 'BLOCKED',
            complete: 'COMPLETE'
          })
        },
        /**
         * Save alert type value for analytics
         * @type {String}
         */
        _analitycEventName: {
          type: String,
          value: ''
        },
        /**
         * Account update criticality status list
         * @type {Array}
         */
        _criticityStatus: {
          type: Object,
          value: () => ({
            alert: 'alert',
            error: 'error'
          })
        },
        /**
         * Validates that you already have the dossier data
         * @type {Boolean}
         */
        _dossiersValidate: {
          type: Boolean,
          value: false
        },
        /**
         * Validate refresh movements after edit alias
         */
        _noRefreshMovements: {
          type: Boolean,
          value: false
        }

      };
    }
    static get observers() {
      return [
        '_parseDashboardAccounts(dashboardAccounts)',
        '_checkDashboardCards(dashboardCards)',
        '_parseFeatureFlag(featureFlagCollection)',
        'getCustomersData(customerResponse)',
        'setPhoneInWeb(customerResponse)',
        '_boostInterbankTransfers(payloadFinancialHealt,messageAccountSelected)',
        'validateReceivedDocuments(upgradeCustomer)',
      ];
    }
    /**
     * @description It triggers an event to request the account selected
     * @param {String} data
     * @public
     */
    changeAccountFromSlider(slider) {
      if (slider) {
        this._productIdSelected = this.c(this._mappedDashboardAccounts, `${this.c(slider, 'slide')}.id`);
        this._transactionsProductId = this.standIn || this.transactionsFeatureFlag === true ? this.c(this._mappedDashboardAccounts, `${this.c(slider, 'slide')}.simpleCode`) : this.c(this._mappedDashboardAccounts, `${this.c(slider, 'slide')}.id`);
        this._fire('set-account-transactions-started', false);
        this._fire('reset-account-has-transactions', null);
        this._fire('reset-has-fetched-pending-transactions', false);
        this._fire('reset-pending-transactions', []);
        this._fire('reset-show-pendings', true);
        this.set('_accountSelected', {});
        this.set('_existRelatedDebitCard', false);
        this.set('_updateDashboardAccount', false);
        this.set('_getAccountAttemps', {
          current: 0,
          max: this.c(this._getAccountAttemps, 'max')
        });
        this.set('_pocketsAttempts', {
          current: 0,
          max: this.c(this._pocketsAttempts, 'max')
        });
        if (this.standIn) {
          this._validateCustomerRecords();
          this.standInitServices();
        } else {
          this._resetUpdateContract();
          this._getAccountData();
        }
      }
    }
    /**
     * @description check if exist almost an card
     * @param {Array} dashboardCards
     */
    _checkDashboardCards(dashboardCards) {
      const _cardProducts = this.c(dashboardCards, '0.products');
      if (this._validList(dashboardCards) && this._validList(_cardProducts)) {
        this.set('existCreditCard', _cardProducts.some(card => this.c(card, 'subProductType') === 'CREDIT_CARD'));
      }
    }
    /**
     * @description close control veil
     * @private
     */
    _closeControlVeil() {
      this._fire('close-control-veil');
    }
    /**
     * @description create more info body
     * @returns more info
     */
    _createMoreInfo() {
      const moreInfo = [
        {
          title: 'cells-account-more-info-general',
          items: this._setTopMoreInfoItems()
        },
        {
          title: 'cells-account-more-info-participants',
          items: this._setParticipantsMoreInfo()
        }
      ];
      if (this._existDebitCard()) {
        moreInfo.push({
          title: 'cells-account-more-info-payment-form',
          items: [
            {
              key: 'cells-account-more-info-card-type',
              value: this._getDebitCardNumber(),
              label: true,
              share: true,
              additionalClass: 'avatar-item-normal-text'
            }
          ]
        });
      }
      if (this.get('codi', this.featureFlags)) {
        moreInfo.push({
          title: 'codi-p2p-settings-header-title',
          items: [
            {
              key: 'cells-product-more-info-codi-operations',
              label: true,
              buttonLabel: 'cells-product-more-info-see',
              event: 'request-codi-qr-account',
              additionalClass: 'avatar-item-normal-text'
            }
          ]
        });
      }
      return moreInfo;
    }
    /**
     * @description validate exists CLABE account
     * @returns {Boolean}
     */
    existCLABE() {
      const _formats = this.c(this._accountSelected, 'formats');
      if (this._validList(_formats)) {
        const _clabe = _formats.find(format => this.c(format, 'numberType.id') === 'CLABE');
        this.set('_clabeAccount', _clabe);
        return Boolean(this._clabeAccount);
      }
    }
    /**
     * Generic Dispatch Event
     * @param {String} eventName
     * @param {Object || null} detail
     * @param {Boolean} composed
     * @param {Boolean} bubbles
     * @private
     */
    _fire(eventName, detail = null, composed = true, bubbles = true) {
      this.dispatchEvent(
        new CustomEvent(eventName, {
          bubbles,
          composed,
          detail
        })
      );
    }
    /**
     * @description get account data
     * @private
     */
    _getAccountData() {
      this._fire('set-product-id', this._productIdSelected);
      this._fire('set-transactions-product-id', this._transactionsProductId);
      const _accountSelected = this._mappedDashboardAccounts.find(account => this.c(account, 'id', this.c(account, 'accountId', undefined)) === this._productIdSelected);
      const movementNumber = this.c((_accountSelected.detail.specificAmounts).find(item => {
        return item.id === 'ACCOUNT_MOVEMENT_NUMBER';
      }), 'name');
      this._fire('set-last-movement-number', movementNumber);
      this._fire('set-transactions-current-account', _accountSelected);
      this._fire('set-transactions-cards', this.c(this.dashboardCards, '0.products'));
      this._fire('set-transactions-virtual-cards', this.digitalCards);
      this.set('_isChecksAccount', this.c(_accountSelected, 'productType', '').includes('CH'));
      if (this._isChecksAccount) {
        this._fire('set-indicator-id', this.indicatorId);
      }
      if (this._featureFlagV2check()) {
        this._getAccountIdSimpleCode();
        this._fire('set-account-version', '2');
        this._fire('set-get-global-account');
      } else {
        this._fire('set-get-account', {
          expand: this.expands
        });
      }
      this._currentAccountIndicators = this.c(_accountSelected, 'detail.indicators', []);
      const _hasPockets = this._getIndicator('HAS_POCKETS');
      this.set('_isBusinessDebitCard', this.subProductsType.includes(this.c(_accountSelected, 'subProductType')));
      this._fire('hidden-operatives-transaction-list', this._isBusinessDebitCard);
      if (this._isBusinessDebitCard && this.c(this.featureFlags, 'enterpriseDebitCard')) {
        this._businessDebitCardMessage();
      } else if (_hasPockets) {
        this._getPockets();
      } else {
        this._setEmptyPocket();
      }
      this._fire('set-get-portabilities', this._productIdSelected);
      this._fire('set-reset-operations');

      // please, if account refresh is made due a navigation from pockest
      // transaccion list must not be updated. This can lead to unnecessary requests
      // by one of the "core" features
      if (!this._updatePockets && !this._noRefreshMovements) {
        this._fire('set-reset-transactions-list');
        this._fire('set-get-transactions-list');
      } else {
        this._noRefreshMovements = false;
      }
      this.messageAccountSelected = this.c(_accountSelected, 'primaryAmount.currency');
    }
    /**
     * @description recovers the validation and sends the corresponding data of the boost interbank transfers message
     * @param {Object} payload
     */
    _boostInterbankTransfers() {
      if (this.isGlomoMiniorAccount || this.customerRecordsStatus) {
        return;
      }
      this._isFlagMessageInterbankTransfers = this.featureFlags?.currencyMxnOpinator;
      this._isFlagMessageCVCurrency = this.featureFlags?.currencyUsdOpinator;
      this.validateMessageBoostInterbankTransfers();
      this._fire('validate-view-message', this.hiddenMessageInterbankTransfers);
      this._fire('title-message', this.titleMessageInterbankTransfers);
      this._fire('text-message', this.textMessageInterbankTransfers);
      this._fire('link-message', this.linkMessageInterbankTransfers);
    }
    /**
     * @description Validate whether the user has documentation pending validation to display the banner
     */
    validateReceivedDocuments(upgradeCustomer) {
      if (upgradeCustomer) {
        const result = {
          type: 'info',
          icon: 'coronita:info',
          title: this.t('account-detail-upgrade-succes-title'),
          messages: [
            this.t('account-detail-upgrade-succes-msg-1', '',)
          ],
        };
        this.showSliderMainWarningLabel('', '');
        this._fire('account-manager-set-update-contract-banner', {
          iconMessageType: result.type,
          iconMessageIcon: result.icon,
          messageHeadingIconInfo: result.title,
          messageIconInfo: result.messages.shift(),
          iconMessageMessages: result.messages,
          hideActions: true,
          showIconMessage: true,
          showIconMessageLinkButton: false
        });
      } else {
        return;
      }
    }
    /**
     * @description validates if the financial health bubble is active, in addition to
     * performing a validation to see if the international transfer boost message is displayed
     */
    validateMessageBoostInterbankTransfers() {
      let messageFlag = this.payloadFinancialHealt.messagesToLoad ?.length === 0;
      if (Object.keys(this.payloadFinancialHealt).length === 0 || messageFlag) {
        if (this._isFlagMessageInterbankTransfers && this.messageAccountSelected === 'MXN') {
          this.hiddenMessageInterbankTransfers = false;
          this.titleMessageInterbankTransfers = 'glomo-account-manager-title-message-boost-interbank-transfers';
          this.textMessageInterbankTransfers = 'glomo-account-manager-text-message-boost-interbank-transfers';
          this.linkMessageInterbankTransfers = 'glomo-account-manager-link-message-boost-interbank-transfers';
        } else if (this._isFlagMessageCVCurrency && this.messageAccountSelected === 'USD') {
          this.hiddenMessageInterbankTransfers = false;
          this.titleMessageInterbankTransfers = 'glomo-account-manager-title-message-boost-cv-currency';
          this.textMessageInterbankTransfers = 'glomo-account-manager-text-message-boost-cv-currency';
          this.linkMessageInterbankTransfers = 'glomo-account-manager-link-message-boost-cv-currency';
        } else {
          this.hiddenMessageInterbankTransfers = true;
        }
      } return;
    }
    /**
     * @description validate the international transfer boost message address
     */
    messageAddressing() {
      if (this.messageAccountSelected === 'MXN') {
        this._fire('message-addressing-interbank-transfers');
      } else if (this.messageAccountSelected === 'USD') {
        this._fire('message-addressing-cv-currency', {
          productId: this._productIdSelected,
          continue: 'account'
        });
      }
    }
    /**
     * @description get account position into mapped accounts list
     * @param {Object} response
     * @returns {Boolean}
     */
    _getAccountIndex(response) {
      let accountId = this._featureFlagV2check() ? this._productIdSelected : this.get('accountId', response);
      return this._mappedDashboardAccounts.findIndex(account => this.get('id', account) === accountId);
    }
    /**
     * @description Method to get Product Limits
     */
    onGetProductLimits(response) {
      const data = response.data[0];
      const amountMNX = data.amountLimits.find((item) => item.currency === 'MXN');
      const amountUDIS = data.amountLimits.find((item) => item.currency === 'UDIS');
      const calculationDate = moment(data.calculationDate).format('LL');
      const formattedAmountMNX = this.getFormattedAmount(this.c(amountMNX, 'amount'), this.localCurrency,  this.localCurrency, this.locale, true, true, true);
      const formattedAmountUDIS = this.getFormattedAmount(this.c(amountUDIS, 'amount'), this.localCurrency, true);

      this.set('productLimits', {
        amountPesos: {
          ...amountMNX,
          amount: formattedAmountMNX
        },
        amountUdis: {
          ...amountUDIS,
          amount: formattedAmountUDIS
        },
        calculationDate: calculationDate
      });
    }
    /**
     * @description Method to handle Product Limits Error
     */
    onGetProductLimitsError() {
      const amountPesos = '';
      const amountUdis = '';
      const calculationDate = '';

      this.set('productLimits', {
        amountPesos: amountPesos,
        amountUdis: amountUdis,
        calculationDate: calculationDate
      });
    }
    /**
     * @description Handles and sends events to configure the icon message component and the productLimits response.
     **/
    _onProductLimitsChanged() {
      const result = this._getUpgradeAccountConfig(this.c(this._accountSelected, 'upgradeData', {}));
      this._fire('account-manager-set-update-contract-banner', {
        iconMessageType: result.type,
        iconMessageIcon: result.icon,
        messageHeadingIconInfo: result.title,
        iconMessageIconLinkButton: result.iconLinkButton,
        messageIconInfo: result.messages.shift(),
        iconMessageMessages: result.messages,
        linkButtonMessage: 'account-detail-upgrade-link-button-label',
        hideActions: false,
        buttonMessage: 'account-detail-upgrade-button-label',
        iconMessageButtonStyle: 'primary',
        iconMessageButtonEventName: 'click-upgrade-account',
        iconMessageLinkButtonEventName: 'click-upgrade-account-restriction-information',
        showIconMessage: true,
        showIconMessageLinkButton: true
      });
      this._fire('send-products-limits', {
        productLimits: this.productLimits
      });
      if (this._analitycEventName !== '') {
        this._fire('analytic-alert-event');
      }
    }
    /**
     * @description Method to get the correct message settings
     *depending on the day since the alert
     * */
    _getUpgradeAccountConfig(data) {
      const dueDate = this._dueDateRecalculated();
      const formattedDueDate = moment(dueDate).format('LL');
      const daysSinceAlert = moment().diff(dueDate.subtract(60, 'days'), 'days');
      const AnalyticEvents = {
        upgradeAcoountDay1: 'ampliamos tu cuenta',
        upgradeAcoountDay11: 'actualiza tu informacion',
        upgradeAcoountDay60: 'restringimos tu cuenta'
      };
      const conditionsAlert = [
        {
          condition: !this.upgradeCustomer && daysSinceAlert >= 0 && daysSinceAlert <= 10,
          action: () => {
            this._analitycEventName = AnalyticEvents.upgradeAcoountDay1;
            this.showSliderMainWarningLabel('warning', this.t('global-products-list-upgrade-account'));
            return {
              type: 'warning',
              icon: 'coronita:caution',
              title: this.t('account-detail-upgrade-warning-severe-title'),
              messages: [
                this.t('account-detail-upgrade-warning-light-msg-1', '', {dueDate: formattedDueDate})
              ],
            };
          }
        },
        {
          condition: !this.upgradeCustomer && daysSinceAlert >= 11 && daysSinceAlert <= 59,
          action: () => {
            this._analitycEventName = AnalyticEvents.upgradeAcoountDay11;
            this.showSliderMainWarningLabel('warning', this.t('global-products-list-upgrade-account'));
            return {
              type: 'warning',
              icon: 'coronita:caution',
              title: this.t('account-detail-upgrade-warning-severe-title-2'),
              messages: [
                this.t('account-detail-upgrade-warning-light-msg-2', '', {dueDate: formattedDueDate})
              ],
            };
          }
        },
        {
          condition: !this.upgradeCustomer && daysSinceAlert >= 60,
          action: () => {
            this.showSliderMainWarningLabel('error', this.t('account-detail-update-contract-main-warning-label'));
            this._analitycEventName = AnalyticEvents.upgradeAcoountDay60;
            this._fire('account-manager-set-blocked-operations', {
              transfers: true,
              billPayment: true,
              cardlessWithdrawal: true,
              creditCardPayment: true,
              refillsAndPackages: true,
              codi: true,
              internationalTransfers: true,
              dimoSend: true,
            });
            this._fire('set-account-for-operations', this._accountSelected);
            return {
              type: 'error',
              icon: 'coronita:alert',
              title: this.t('account-detail-upgrade-blocked-title'),
              messages: [
                this.t('account-detail-upgrade-blocked-msg-1', '',),
              ],
            };
          }
        }
      ];
      const result = conditionsAlert.find(cond => cond.condition)?.action();
      return result;
    }
    /**
     * @description method to validate dates of list documents dossiers
     */
    _dueDateRecalculated() {
      this._featureFlagAccountsDocumentsDossiers = this.featureFlagCollection['glomo.accounts.documentsDossiersV1'] ? this.featureFlagCollection['glomo.accounts.documentsDossiersV1']?.value : false;
      if (this._featureFlagAccountsDocumentsDossiers) {
        return moment(this.c(this.listDocumentationDossiers, 'dueDateToUpdate'));
      } else {
        return moment(this.c(this.listDocumentationDossiers, 'dueDateToUpdate'))
          .add(this.daysToAddDueDate, 'days');
      }
    }
    /**
     * @description Method to handle restriction info
     */
    onUpgradeAccountRestrictionInformationClicked() {
      this.validateModalRestriccion(this.modalRestriccion);
      this._fire('navigate-to-upgrade-N2-N4-page-info', {
        productId: this._productIdSelected,
        upgradeData: this.c(this._accountSelected, 'upgradeData'),
        productLimits: this.productLimits
      });
    }
    /**
     * @description Validation of Modal Restriccion for flow UpgradeAccount.
     **/
    validateModalRestriccion(statusModal = '') {
      const isBloked = statusModal === 'BLOCKED';
      const microIllustrationHeading =  isBloked ? this.t('account-detail-upgrade-blocked-modal-restrictions-title') : this.t('account-detail-upgrade-warning-modal-restrictions-title');
      const firstParagraph = isBloked ? this.t('account-detail-upgrade-blocked-modal-restricions-description') : this.t('account-detail-upgrade-warning-modal-restricions-description');
      this._fire('account-detail-modal-headingText-restriction-information', microIllustrationHeading);
      this._fire('account-detail-modal-firstParagraphText-restriction-information', firstParagraph);
    }
    /**
     * get proactivity campaigns asociated to an account.
     **/
    getProactivityCampaigns(campaigns) {
      this._proactivityCampaigns = campaigns;
    }
    /**
     * @description match list documentation dossiers account with current account last 10 digits
     * @returns {Boolean}
     */
    _currentAccountAlertedByDossier() {
      const accountNumber = this.get('account.number', this.listDocumentationDossiers) || '0';
      const alertedAccount = this._dossiersValidate ? accountNumber : accountNumber.slice(10);
      return this.c(this._accountSelected, 'description.value', '').slice(10) === alertedAccount;
    }
    /**
     * @description set account success response
     * @param {Object} response
     * @emits set-account-for-operations
     * @emits set-account-slide
     * @emits set-accounts
     * @emits set-loaded-account
     * @emits set-loaded-operations
     * @emits account-manager-get-offers
     * @emits set-loaded-account-error
     */
    getAccountSuccessResponse(response) {
      if (response && this._validList(this._mappedDashboardAccounts)) {
        this._fire('account-manager-set-blocked-operations', {});
        this._matchAccount(response);
        this._fire('set-account-slide', this._getAccountIndex(response));
        this._fire('set-accounts', this._mappedAccounts(this._mappedDashboardAccounts));
        this._fire('set-loaded-account', this._proactivityCampaigns);
        this._fire('set-loaded-operations', true);
        this._setPendingDepositBalance(this._accountSelected);
        this._updateAmountDashboardAccounts(this._accountSelected);
        this._currentAccountIndicators = this.c(this._accountSelected, 'detail.indicators', []);
        this.digitalAccount = this._getIndicator('IS_DIGITAL');
        this._validateCustomerRecords();
      } else {
        this.getAccountErrorResponse({});
      }
    }

    /**
     * @description get list documentation dossiers success response
     * @param {Object} response
     */
    getListDocumentsDossiers(data) {
      if (this.listDocumentationDossiers === null) {
        this.set('listDocumentationDossiers', data[0]);
        this.set('_dossiersValidate', true);
      }
    }
    /**
     * fires and event to go to upgrade account feature.
     **/
    onUpgradeAccountClicked() {
      let _upgradeModularHybrid = this.c(this.featureFlags, 'upgradeCustomer', false);
      let _upgradeModularFlag = this.c(this.featureFlags, 'upgradeModularFastrack', false);
      const _upgradeAccountDetail = this.c(this._accountSelected, 'upgradeData');
      const _upgradeModularDetail = {
        clientId: this.clientId,
        accountId: this._productIdSelected,
        recipients: true,
        isDigital: this._getIndicator(this.c(this._accountSelected, 'detail.indicators', []), 'IS_DIGITAL').isActive,
        entryPoint: 'warning',
        target: 'upgrade',
      };
      const _upgradeModularDetailHybrid = {
        clientId: this.clientId,
        accountId: this._productIdSelected,
        accountLevel: this._getLevel(),
        productName: this._accountSelected?.title?.name,
        isPayroll: this._isPayrrollAccount(),
        simpleCode: this.currentAccountSimpleCode,
        accountNumber: this._accountSelected?.number?.slice(-4),
        entryPoint: 'alert',
        target: 'upgrade',
      };

      if (_upgradeModularHybrid) {
        this.dispatchEvent(new CustomEvent('navigate-to-upgrade-N2-N4-page-hybrid', {
          detail: _upgradeModularDetailHybrid,
          bubbles: true,
          composed: true
        }));
      } else {
        this.dispatchEvent(new CustomEvent(_upgradeModularFlag ? 'navigate-to-upgrade-N2-N4-page' : 'navigate-to-upgrade-account', {
          detail: _upgradeModularFlag ? _upgradeModularDetail : _upgradeAccountDetail,
          bubbles: true,
          composed: true
        }));
      }
      if (this._analitycEventName !== '') {
        this._fire('analytic-alert-event-button-click', { customFields: `motivo de actualizacion: ${this._analitycEventName}` });
      }
    }
    /**
     * set account error response
     * @param {Object} response
     */
    getAccountErrorResponse(response) {
      this._matchAccount({
        accountId: this._productIdSelected
      });
      this._fire('set-account-slide', this._getAccountIndex({
        accountId: this._productIdSelected
      }));
      this._fire('set-accounts', this._mappedErrorAccounts(this._mappedDashboardAccounts));
      this._fire('set-loaded-account-error');
    }
    /**
     * @description get formatted account number
     * @returns {String}
     */
    _getAccountNumber() {
      const _accountNumber = this.c(this._accountSelected, 'description.value');
      const _reducedAccountNumber = _accountNumber.substr(10);
      return `${_reducedAccountNumber.substr(0, 3)} ${_reducedAccountNumber.substr(3, 3)} ${_reducedAccountNumber.substr(6)}`;
    }
    /**
     * @description set autorized participants
     * @param {Array} items
     * @param {Array} participants
     * @returns {Array}
     */
    _getAuthorizeds(items, participants) {
      participants.forEach(participant => {
        if (this.c(participant, 'participantType.id') !== 'HOLDER') {
          items.push({
            key: 'cells-account-more-info-participant-authorized',
            value: `${this.c(participant, 'firstName', '')} ${this.c(participant, 'lastName', '')}`,
            additionalClass: 'avatar-item-normal-text'
          });
        }
      });
      return items;
    }
    /**
     * @description get CLABE account
     * @returns {String}
     */
    _getCLABE() {
      if (this._clabeAccount) {
        const _number = this.c(this._clabeAccount, 'number', '');
        return `${_number.substr(0, 3)} ${_number.substr(3, 3)} ${_number.substr(6, 11)} ${_number.substr(17)}`;
      }
    }
    /**
     * get indicator active shearching on _currentAccountIndicators state and its key isActive
     * @param {String} indicator
     * @returns {Boolean}
     */
    _getIndicator(indicator) {
      const _indicator = this._currentAccountIndicators.find(_item => this.c(_item, 'id') === indicator);
      return this.c(_indicator, 'isActive', false);
    }
    /**
     * @description get customer services success response
     * @param {Object} payload
     */
    getCustomerServicesSuccess(payload) {
      this._closeControlVeil();
      if (payload && Array.isArray(payload) && payload.length) {
        this.set('_existPortability', true);
        this.set('_portabilityList', payload);
      } else {
        this.getCustomerServicesError(payload);
      }
    }
    /**
     * @description get customer services error response
     * @param {Object} payload
     */
    getCustomerServicesError(payload) {
      this._closeControlVeil();
      this.set('_existPortability', false);
    }
    /**
     * @description get data from local storage
     */
    _getLocalStorageData() {
      this._fire('global-get-from-storage', {
        key: this.localStorageKey
      });
    }
    /**
     * @description get data from local storage Evidences
     */
    _getLocalStorageEvidencesData() {
      this._fire('global-get-from-storage', {
        key: this.evidencesStorage
      });
    }
    /**
     * @description get data from local storage
     */
    _getUpdateContractDate() {
      this._fire('global-get-from-storage', {
        key: 'update_contract_success_date',
        secure: true
      });
    }
    /**
     * @description validate if exist debit card assosiated
     * @returns {Boolean}
     */
    _existDebitCard() {
      const _debitCard = this.c(this._accountSelected, 'debitCard');
      if (this.c(_debitCard, 'numberType.id') === 'PAN') {
        this.debitCardNumber = this.c(_debitCard, 'number');
      }
      return Boolean(this.debitCardNumber);
    }
    /**
     * @description get debit card number
     * @returns {String} formatted debit card number
     */
    _getDebitCardNumber() {
      if (this.debitCardNumber) {
        return `${this.debitCardNumber.substr(0, 4)} ${this.debitCardNumber.substr(4, 4)} ${this.debitCardNumber.substr(8, 4)} ${this.debitCardNumber.substr(12, 4)}`;
      }
    }
    /**
     * @description set holder participant
     * @param {Array} items
     * @param {Array} participants
     * @returns {Array}
     */
    _getHolder(items, participants) {
      const _holder = participants.find(participant => this.c(participant, 'participantType.id') === 'HOLDER');
      if (_holder) {
        items.push({
          key: 'cells-account-more-info-participant-titular',
          value: `${this.c(_holder, 'firstName', '')} ${this.c(_holder, 'lastName', '')}`,
          additionalClass: 'avatar-item-normal-text'
        });
      }
      return items;
    }
    /**
     * @description get pockets and set pocket visibility
     * @private
     */
    _getPockets() {
      const _pocketsFlag = this.c(this.featureFlags, 'pockets', false);
      this._fire('set-hidden-pocket-skeleton', _pocketsFlag);
      if (_pocketsFlag) {
        this._fire('set-hidden-pocket-skeleton', false);
        this._fire('set-hidden-pocket-summary', true);
        this._fire('set-get-pockets-balance', {
          'relatedContract.number': this._productIdSelected
        });
      } else {
        this._fire('set-hidden-pocket-skeleton', !_pocketsFlag);
      }
    }
    /**
     * @decription set pocket balance if response is successful
     * @param {Object} data
     * @public
     */
    getPocketSuccessResponse(data) {
      if (data && this._validList(data)) {
        const _balance = data.find(balance => this.c(balance, 'totalAmount'));
        const pocketAmount = {
          className: 'card-products-item link-style background-bbva-100',
          imgSrc: this.pocketImg,
          heading: 'cells-pockets-summary-heading',
          labelMoreInfo: 'cells-pockets-summary-more-info',
          moreInfoAriaLabel: 'cells-pockets-summary-more-info-aria-label',
          progressValue: false,
          noHugeNoItems: true,
          mainItems: [
            {
              localCurrency: this.c(_balance, 'totalAmount.currency'),
              value: {
                amount: this.c(_balance, 'totalAmount.amount'),
                currencyCode: this.c(_balance, 'totalAmount.currency'),
                class: 'amount-xl'
              },
            }
          ]
        };
        this._fire('set-pocket-info', pocketAmount);
        this._fire('load-pocket-data');
        this._fire('set-hidden-pocket-skeleton', this.c(this.featureFlags, 'pockets', false));
        this._fire('set-hidden-pocket-summary', !this.c(this.featureFlags, 'pockets', false));
      } else {
        this._setEmptyPocket();
      }
    }
    /**
     * @decription set pocket balance if response is error
     * @param {Object} data
     * @public
     */
    getPocketErrorResponse(data) {
      const errorPocket = {
        errorMessage: 'cells-pocket-error-retry-message',
        actionErrorLink: true,
        className: 'card-products-item link-style background-bbva-100'
      };
      if (this._pocketsAttempts.current < this._pocketsAttempts.max) {
        this._pocketsAttempts.current++;
        Object.assign(errorPocket, {
          actionErrorLabel: 'cells-pocket-error-btn-retry'
        });
      } else {
        Object.assign(errorPocket, {
          errorMessage: 'cells-pocket-error-final-message',
          actionErrorLink: false,
          actionErrorLabel: null
        });
      }
      this._fire('set-pocket-error', errorPocket);
      this._fire('set-pocket-on-error');
      this._fire('set-hidden-pocket-skeleton', this.c(this.featureFlags, 'pockets', false));
      this._fire('set-hidden-pocket-summary', !this.c(this.featureFlags, 'pockets', false));
    }
    /**
     * @description get product name
     * @returns {String}
     */
    _getProductName() {
      return this.c(this._accountSelected, 'title.name', '');
    }
    /**
     * @description get related contracts
     * @public
     */
    getRelatedContracts() {
      if (this.standIn) {
        this.standInOperationModals({ id: 'detailInfo' });
        return;
      }
      if (this._existRelatedDebitCard) {
        this._navigateToAccountMoreInfo();
      } else {
        this._openControlVeil();
        this.relatedContractV2 = false;
        if (this._featureFlagV2check()) {
          this._getRelatedContractV2();
        } else {
          this._fire('set-request-related-contracts');
        }
      }
    }
    /**
     * @decription set Related Contracts data if response is successful
     * @param {Object} data
     * @public
     */
    getRetaledContractsSuccessResponse(payload) {
      this._closeControlVeil();
      if (this._validList(payload)) {
        const _relatedContract = payload.find(relatedContract => this.c(relatedContract, 'product.id') === 'CARDS');
        if (_relatedContract) {
          const _accountSelected = this._accountSelected;
          this.set('_existRelatedDebitCard', true);
          Object.assign(_accountSelected, {
            debitCard: {
              number: this.c(_relatedContract, 'number'),
              numberType: this.c(_relatedContract, 'numberType')
            }
          });
          this.set('_accountSelected', _accountSelected);
          this._navigateToAccountMoreInfo();
        } else {
          this._navigateToAccountMoreInfo();
        }
      } else {
        this._navigateToAccountMoreInfo();
      }
    }
    /**
     * @description set account more info
     * @private
     */
    _setAccountMoreInfo() {
      this._fire('set-account-detail-product-more-info', {
        productId: this._productIdSelected,
        product: this._createMoreInfo()
      });
    }
    /**
     * @decription error on get Related Contracts
     * @param {Object} data
     * @public
     */
    getRetaledContractsErrorResponse(data) {
      this._closeControlVeil();
      this._navigateToAccountMoreInfo();
    }
    /**
     * @enableSwiftCode get SWIFT account
     * @returns {String}
     */
    _getSWIFT() {
      return this.swiftCode;
    }
    /**
     * @description initialize page
     */
    init(param) {
      if (this.native && !this._initialized) {
        this._requestClientId();
      }
      if (!this._initialized) {
        this._initialized = this.get('init', param);
        if (this._initialized && this._checkProductId() && this._checkDashboardAccounts()) {
          this._setInitialAccountsSkeleton();
          this._getLocalStorageData();
          this._getUpdateContractDate();
          this._getLocalStorageEvidencesData();
          if (this.standIn) {
            this._fire('init-account-stand-in');
            this.standInitServices();
          } else {
            this._getAccountData();
          }
          this._fire('global-get-from-storage', { key: this.codicelKey });
        }
      }
    }
    /**
     * @description initialize customer records service
     * @event init-customer-documents
     * @private
     */
    _validateCustomerRecords() {
      if (this.financialOverviewResponse && this.get('featureFlags.levelUp')) {
        const contracts = this.c(this.financialOverviewResponse, 'data.contracts', []);
        const getContract = contracts.find(({ id }) => id === this._productIdSelected);
        this.currentAccountSimpleCode = this.c(getContract, 'simpleCode', '');
        const customerId = this.c(this.user, 'customerId', '');
        this.accountLevel = this._getLevel();
        if (this.currentAccountSimpleCode && customerId &&
          (this.accountLevel === '04' || this.accountLevel === '05')) {
          const requestBody = {
            contract: {
              id: this.currentAccountSimpleCode
            },
            customer: {
              id: customerId
            }
          };
          this._fire('init-customer-documents', requestBody);
        } else {
          this.customerRecordsStatus = false;
        }
      }
    }
    /**
     * @description check productIdSelected
     * @returns {Boolean}
     */
    _checkProductId() {
      return this._productIdSelected && this._productIdSelected !== 'undefined';
    }
    /**
     * @description check dashboard accounts list
     * @returns {Boolean}
     */
    _checkDashboardAccounts() {
      this._fire('set-pagination', this._validList(this._mappedDashboardAccounts) && this._mappedDashboardAccounts.length > 1);
      return this._validList(this._mappedDashboardAccounts);
    }
    /**
     * @description match account from response with dashboard account
     * @param {Object} response
     */
    _matchAccount(response) {
      const _matchAccountIntoList = this._mappedDashboardAccounts.map(account => {
        let _account = {};
        let accountId = this._featureFlagV2check() ? this._productIdSelected : this.get('accountId', response);
        if (this.c(account, 'id') === accountId) {
          _account = this._setAccountFromResponse(response);
          this.set('_accountSelected', Object.assign(account, _account));
          this._fire('set-account-for-operations', this._accountSelected);
          this._getAccountLimits(this._accountSelected);
          this._navigatePocketsDeeplink();
        }
        Object.assign(account, _account);
        return account;
      });
      this.set('_mappedDashboardAccounts', _matchAccountIntoList);
    }
    /**
     * @description When get the account information navigate to
     * the pockets flow if enter through its deeplink
     */
    _navigatePocketsDeeplink() {
      if (this._initPocketDeepLink) {
        this._initPocketDeepLink = false;
        this.navigatePockets();
      }
    }
    /**
     * @description get product limits
     * @param {Object} accountSelected
     */
    _getAccountLimits(accountSelected) {
      if (this.c(accountSelected, 'upgradeable')) {
        this._fire('get-product-limits', {
          'product-id': 15,
          'subproduct.id': '0500',
          'accountLevel': 'N2',
          'limit.id': 'DEPOSITS_MONTHLY'
        });
        this._addStatus(accountSelected);
      }
    }
    /**
     * @description add status for summary
     * @param {Object} accountSelected
     */
    _addStatus(accountSelected) {
      const statusAccount = Object.assign(this._accountSelected,  {
        status: {
          id: this.c(accountSelected, 'upgradeData.statusType'),
          class: this.c(accountSelected, 'upgrade.data.criticity'),
          message: this.c(accountSelected, 'upgradeData.message')
        }
      });
      this.set('_accountSelected', statusAccount);
    }
    /**
     * get account status for product summary
     * @param {Object} account
     */
    _getAccountStatusAditionalInfo(account) {
      if (this.c(account, 'status')) {
        const _statusId = this.c(account, 'upgradeData.statusType', '');
        const statusAccount = {
          id: _statusId,
          class: _statusId.toLowerCase(),
        };
        switch (_statusId.toUpperCase()) {
          case 'DORMANT':
            Object.assign(statusAccount, {
              message: 'cells-product-summary-account-status-dormant-message'
            });
            break;
          case 'BLOCKED':
            Object.assign(statusAccount, {
              message: 'account-detail-upgrade-status-message'
            });
            break;
          case 'CANCELED':
            Object.assign(statusAccount, {
              message: 'cells-product-summary-account-status-canceled-message'
            });
            break;
          default:
            Object.assign(statusAccount, {
              class: undefined,
              message: undefined,
            });
            break;
        }
        return statusAccount;
      }
    }
    /**
     * @description open control veil
     * @private
     */
    _openControlVeil() {
      this._fire('open-control-veil');
    }
    /**
     * @description parse dashboard accounts and set mapped dashboard accounts
     * @param {Array} dashboardAccounts
     */
    _parseDashboardAccounts(dashboardAccounts) {
      if (this._validList(dashboardAccounts)) {
        this.set('_mappedDashboardAccounts', dashboardAccounts.map(({ products = [] }) => this._setProducts(products)).flat());
        this._initPageDeepLink();
      }
    }
    /**
     * @description Second method that is executed when the data is loaded
     * and if it enters through deeplink it executes the init method normally again
     */
    _initPageDeepLink() {
      if (this._initPocketDeepLink) {
        this.set('_initialized', false);
        this.init({ init: true });
      }
    }
    /**
     * @description set products from dashboard accounts
     * @param {Array} _dashboardAccounts
     */
    _setProducts(_dashboardAccounts) {
      return _dashboardAccounts
        .filter(
          (accoutFilter) =>
            !this.accountsNotOperationals.some(
              (condition) =>
                accoutFilter.titleName === condition ||
                accoutFilter.productId === condition ||
                accoutFilter.subProductType === condition
            )
        )
        .map(account => {
          return {
            alias: this.c(account, 'alias'),
            description: this.c(account, 'description', {
              masked: true,
              value: this.c(account, 'description.value', this.c(account, 'number', ''))
            }),
            detail: this.c(account, 'detail', undefined),
            id: this.c(account, 'id', this.c(account, 'accountId')),
            simpleCode: this.c(account, 'simpleCode'),
            number: this.c(account, 'number', undefined),
            productId: this.c(account, 'id', this.c(account, 'accountId')),
            level: this.c(account, 'level', undefined),
            name: this.c(account, 'titleName', ''),
            numberType: this.c(account, 'numberType', undefined),
            primaryAmount: this.c(account, 'primaryAmount', undefined),
            status: this.c(account, 'status', undefined),
            productType: this.c(account, 'productId', undefined),
            subProductType: this.c(account, 'subProductType'),
            specificAmounts: this.c(account, 'detail.specificAmounts'),
            upgradeable: this.c(account, 'upgradeable'),
            upgradeData: this.c(account, 'upgradeData')
          };
        }) || [];
    }
    _navigateToAccountMoreInfo() {
      this._setAccountMoreInfo();
      this._fire('flag-share-all-information', this.c(this.featureFlags, 'shareAllInformation', false));
      this._fire('navigate-to-product-more-info', {
        productId: this._productIdSelected
      });
    }
    /**
     * @description configuration for business debit card message
     * @event set-pocket-info
     * @event set-pocket-on-error
     * @event set-hidden-pocket-skeleton
     * @event set-hidden-pocket-summary
     */
    _businessDebitCardMessage() {
      const properties = {
        typeError: 'info',
        iconError: 'coronita:info',
        errorMessage: 'glomo-account-manager-business-debit-card-message-2',
        actionErrorLabel: '',
        className: 'layout-clean',
        errorCellsIconMessageClass: 'information-message'
      };
      this._fire('set-pocket-info', properties);
      this._fire('set-pocket-on-error');
      this._fire('set-hidden-pocket-skeleton', true);
      this._fire('set-hidden-pocket-summary', false);
      this._fire('account-detail-icon-message-show', false);
    }
    /**
     * @description set parsed accounts to visual
     * @param {Array} accounts
     * @returns accounts
     */
    _mappedAccounts(accounts) {
      const _accounts = this._mappedDashboardAccounts.map(account => {
        let accountId = this._featureFlagV2check() ? this._productIdSelected : this.get('id', this._accountSelected);
        const _accountSelected = this.c(account, 'id') === accountId ? {
          id: this.c(this._accountSelected, 'id'),
          heading: this.c(this._accountSelected, 'alias', this.c(account, 'alias', this.c(this._accountSelected, 'titleName'))),
          showIconAndMask: this.showIconAndMask,
          iconAndMask: {
            iconSrc: this.bankImg,
            mask: this.c(this._accountSelected, 'description.value'),
          },
          mainItems: [
            {
              localCurrency: this.c(this._accountSelected, 'currencies.0.currency'),
              key: 'dashboard-account-current-balance',
              value: {
                amount: this.c(this._accountSelected, 'primaryAmount.amount'),
                currencyCode: this.c(this._accountSelected, 'currencies.0.currency'),
                class: 'amount-xl'
              }
            }
          ],
          labelMoreInfo: 'cells-account-summary-account-slider-more-info',
          loaded: true
        } : {
          id: this.c(account, 'id'),
          loaded: false
        };
        if (this.subProductsType.includes(this.c(account, 'subProductType')) && this.c(this.featureFlags, 'enterpriseDebitCard')) {
          Object.assign(_accountSelected, {
            class: 'information-message',
            errorOnLoad: true,
            heading: 'glomo-account-manager-business-debit-card-heading',
            icon: 'coronita:caution',
            iconAndMask: {},
            iconLabel: 'Important message',
            labelMoreInfo: '',
            loaded: true,
            mainItems: [],
            message: 'glomo-account-manager-business-debit-card-message-1',
            showIconAndMask: {},
            type: 'warning',
          });
        }
        return _accountSelected;
      });
      this.set('_accountsMapped', _accounts);
      return this._accountsMapped;
    }
    /**
     * @description map error account
     * @param {Array} accounts
     * @returns {Array}
     */
    _mappedErrorAccounts(accounts) {
      const _accounts = this._mappedDashboardAccounts.map(account => {
        const _accountId = this.c(this._accountSelected, 'id', this.c(account, 'id', this.c(account, 'accountId', undefined)));
        const _errorAccount = {};
        if (_accountId === this.c(account, 'id', this.c(account, 'accountId'))) {
          Object.assign(_errorAccount, {
            id: _accountId,
            type: 'error',
            iconLabel: 'Important message',
            icon: 'coronita:alert',
            class: 'orange-error-box__message',
            heading: 'cells-product-summary-card-orange-service-one-error-title',
            message: 'cells-product-summary-card-orange-service-one-error',
            errorOnLoad: true,
            loaded: true
          });
          if (this._getAccountAttemps.current < this._getAccountAttemps.max) {
            this._getAccountAttemps.current++;
            Object.assign(_errorAccount, {
              errorMessage: {
                button: 'cells-pocket-error-btn-retry',
                dataSelector: this.productIdSelected
              }
            });
          }
        } else {
          Object.assign(_errorAccount, {
            id: _accountId,
            loaded: true
          });
        }
        return _errorAccount;
      });
      return _accounts;
    }
    /**
     * @description parse feature flags from glomo-settings
     * @param {Object} featureFlagCollection
     */
    _parseFeatureFlag(featureFlagCollection) {
      if (featureFlagCollection && this._validList(Object.keys(featureFlagCollection))) {
        const _featureFlags = this.featureFlags;
        Object.keys(_featureFlags).forEach(flag => {
          this.set(`featureFlags.${flag}`,
            this.c(featureFlagCollection[`glomo.account.${flag}`], 'value',
              this.c(featureFlagCollection[`glomo.account.${flag}`], 'defaultValue')));
        });
        this.set('_localStorageValue', {
          featureFlags: this.featureFlags
        });
        this._setInLocalStorage();
        this._fire('set-feature-flags', this.featureFlags);
      }
    }
    /**
     * @description reset values
     */
    reset() {
      this._fire('account-detail-icon-message-show', false);
      this.set('_initialized', false);
      this.customerRecordsStatus = false;
      this.set('_initPocketDeepLink', false);
      this.set('_productIdSelected', '');
      this.set('_transactionsProductId', '');
      this.set('featureFlagCollection', {});
      this.set('_existRelatedDebitCard', false);
      this.set('upgradeCustomer', false);
      this.set('_existPortability', false);
      this.set('_portabilityList', false);
      this.set('_updateDashboardAccount', false);
      this.set('_getAccountAttemps', {
        current: 0,
        max: this.c(this._getAccountAttemps, 'max')
      });
      this.set('_pocketsAttempts', {
        current: 0,
        max: this.c(this._pocketsAttempts, 'max')
      });
      this._fire('reset-product-summary', {
        value: false
      });
      this._fire('set-pending-transactions-feature-flag', undefined);
      if (this.transactionsFeatureFlag === true) {
        this._fire('set-transactions-api-version', this.get('transactionsApiVersions.1'));
      }
      this._fire('set-reset-operations');
      this._fire('set-reset-transactions-list');
      this._fire('set-last-movement-number', undefined);
      this._fire('reset-is-pending', undefined);
      this._fire('reset-is-spei', undefined);
      this._resetUpdateContract();
    }
    /**
     * @description set account CLABE
     * @param {Array} items
     * @returns Array
     */
    _setAccountCLABE(items) {
      if (this.existCLABE()) {
        items.push({
          key: 'cells-product-more-info-account-clabe',
          additionalClass: 'avatar-item-normal-text',
          value: this._getCLABE(),
          label: true,
          share: true
        });
      }
      return items;
    }
    /**
     * @description set data from local storage
     * @param {Object} data
     */
    setDataFromLocalStorage(data) {
      if (this.c(data, 'featureFlags') && this._validList(Object.keys(this.c(data, 'featureFlags')))) {
        this.featureFlags = this.c(data, 'featureFlags');
      } else {
        this.set('_localStorageValue', {
          featureFlags: this.featureFlags
        });
      }
      this._setInLocalStorage();
      this._fire('set-feature-flags', this.featureFlags);
    }
    /**
     * @description global set in local storage
     */
    _setInLocalStorage() {
      this._fire('global-set-in-storage', {
        key: this.localStorageKey,
        value: this._localStorageValue
      });
    }
    /**
     * @description set balance good payment key values
     * @param {Object} accountSelected
     */
    _setPendingDepositBalance(accountSelected) {
      const _existSpecificAmounts = this.c(accountSelected, 'detail.specificAmounts');
      if (accountSelected && _existSpecificAmounts) {
        const _balance = _existSpecificAmounts.find(balance => this.c(balance, 'id') === 'PENDING_DEPOSIT_BALANCE');
        if (_balance && this.c(_balance, 'amounts.0.amount') > 0) {
          this._fire('set-hidde-pending-deposit-balance', false);
          this._fire('set-pending-deposit-balance-key-value', {
            localCurrency: this.localCurrency,
            key: 'cells-product-summary-account-check-hold',
            value: {
              amount: this.c(_balance, 'amounts.0.amount'),
              currencyCode: this.c(_balance, 'amounts.0.currency'),
            }
          });
        } else {
          this._fire('set-hidde-pending-deposit-balance', true);
        }
        this._fire('set-hidde-pending-deposit-balance-skeleton', true);
      }
    }
    _setEmptyPocket() {
      this._fire('set-pocket-info', {
        imgSrc: this.pocketImg,
        heading: 'cells-pockets-summary-zero-pockets',
        labelMoreInfo: 'cells-pockets-summary-create-pockets',
        noHugeNoItems: true,
        progressValue: true,
        className: 'card-products-item link-style background-bbva-100'
      });
      this._fire('load-pocket-data');
      this._fire('set-hidden-pocket-skeleton', this.c(this.featureFlags, 'pockets', false));
      this._fire('set-hidden-pocket-summary', !this.c(this.featureFlags, 'pockets', false));
    }
    /**
     * @description set account more info
     * @private
     */
    _setTopMoreInfoItems() {
      let items = [
        {
          key: 'cells-product-more-info-product',
          value: this._getProductName(),
          additionalClass: 'avatar-item-normal-text',
        },
        {
          key: 'cells-product-summary-account-heading',
          value: this._getAccountNumber(),
          additionalClass: 'avatar-item-normal-text',
          label: true,
          share: true
        }
      ];
      items = this._setAccountCLABE(items);
      items = this._setAccountSWIFT(items);
      items = this._setPhoneNumber(items);
      items = this._setPayrollChange(items);
      return items;
    }
    /**
     * @description set participants
     * @private
     */
    _setParticipantsMoreInfo() {
      let items = [];
      const participants = this.c(this._accountSelected, 'participants');
      items = this._getHolder(items, participants);
      items = this._getAuthorizeds(items, participants);
      return items;
    }
    /**
     * @description set portability access
     * @param {Array} items
     * @returns Array
     */
    _setPayrollChange(items) {
      if (this._existPortability) {
        items.push({
          id: this._portabilityList,
          key: 'cells-product-more-info-account-portability',
          label: true,
          buttonLabel: 'cells-product-more-info-portability-status',
          event: 'navigate-to-portabilities',
          additionalClass: 'avatar-item-normal-text'
        });
      }

      return items;
    }
    /**
     * @description set phone number
     * @param {Array} items
     * @returns {Array}
     */
    _setPhoneNumber(items) {
      if (this.phoneNumber) {
        items.push({
          key: 'cells-product-more-info-account-spei',
          value: `${this.phoneNumber.substring(0, 2)} ${this.phoneNumber.substring(2, 6)} ${this.phoneNumber.substring(6)}`,
          label: true,
          share: true,
          additionalClass: 'avatar-item-normal-text'
        });
      }
      return items;
    }
    /**
     * @description set account SWIFT
     * @param {Array} items
     * @returns {Array}
     */
    _setAccountSWIFT(items) {
      if (this.enableSwiftCode) {
        items.push({
          key: 'cells-product-more-info-account-swift-code',
          value: this._getSWIFT(),
          label: true,
          share: true,
          textInfo: 'cells-product-more-info-account-cci-info',
          textInfoIconClass: 'color-core-blue',
          iconInfo: 'coronita:info',
          additionalClass: 'avatar-item-normal-text'
        });
      }
      return items;
    }
    /**
     * @description return data from service
     * @param {Object} response
     * @returns {Object}
     */
    _setAccountFromResponse(response) {
      const primaryAmount = {
        amount: this.c(response, 'availableBalance.currentBalances.0.amount'),
        currency: this.c(response, 'availableBalance.currentBalances.0.currency') ? this.c(response, 'availableBalance.currentBalances.0.currency') : this.c(response, 'currencies.0.currency'),
        label: 'dashboard-account-current-balance'
      };
      let AccountFromResponse = {
        accountFamily: this.c(response, 'accountFamily', {}),
        accountType: this.c(response, 'accountType', {}),
        availableBalance: this.c(response, 'availableBalance', []),
        bank: this.c(response, 'bank', {}),
        conditions: this.c(response, 'conditions', []),
        currencies: this.c(response, 'currencies', []),
        formats: this.c(response, 'formats', []),
        holds: this.c(response, 'holds', []),
        number: this.c(response, 'number', ''),
        numberType: this.c(response, 'numberType', {}),
        participants: this.c(response, 'participants', []),
        primaryAmount,
        status: this.c(response, 'status', {}),
        title: this.c(response, 'title', {}),
        openingDate: this.c(response, 'openingDate', ''),
        alias: this.c(response, 'alias', this.c(this._accountSelected, 'alias', '')),
        accountId: this.c(response, 'accountId', this._productIdSelected)
      };
      if (this._featureFlagV2check()) {
        let availableBalance = AccountFromResponse.availableBalance;
        const defaultCurrency = this.c(response, 'currencies.0.currency');
        ['currentBalances', 'postedBalances', 'pendingBalances'].forEach(balanceType => {
          availableBalance[balanceType] = availableBalance[balanceType].map(balance =>
            Object.assign({}, balance, {
              currency: balance.currency === '' ? defaultCurrency : balance.currency
            })
          );
        });
        Object.assign(AccountFromResponse, {
          participants: this.participantsList,
          title: this.c(response, 'product.subproduct', {}),
          accountType: this.c(response, 'product', {}),
          accountFamily: this.c(response, 'accountType', {})
        });
      }
      return AccountFromResponse;
    }
    /**
     * @description set initial accounts skeletons
     * @private
     */
    _setInitialAccountsSkeleton() {
      const _accountsNotLoaded = this._mappedDashboardAccounts.map(account => this._setNotLoadedAccount(account));
      this._fire('set-accounts', _accountsNotLoaded);
    }
    /**
     * @description set product id from navigation
     * @param {Object} data
     */
    setProductId(data) {
      if (data) {
        this._productIdSelected = this.c(data, 'productId', '');
        this._transactionsProductId = this.standIn || this.transactionsFeatureFlag === true ? this.c(data, 'simpleCode', '') : this.c(data, 'productId', '');
        this._deepLinkVerification(data);
        this._deepLinkVerificationTdd(data);
        this._setPendingTransactionsFlag();
        if (this.transactionsFeatureFlag === true || this.standIn) {
          this._setTransactionsApiVersions();
        }
      }
    }
    /**
     * @description First validation that runs on the page when navigate by deeplink
     * Check the key is correct with the flow and extracts the id from the arguments
     * @param {Object} data
     * @event send-product-id-account-deeplink data
     * @returns {Object} data
     */
    _deepLinkVerification(data) {
      if (data.action === this.keyPocketDeepLink && !!data.filter?.args.length) {
        this._productIdSelected = this.get('filter.args.0', data);
        this._transactionsProductId = this.get('filter.args.0', data);
        this._initPocketDeepLink = true;
        this._fire('send-product-id-account-deeplink', { productId: this._productIdSelected });
      }
    }
    /**
     * @description When a push notification is received due to insufficient balance, with the debit card's last digits
     * The physical card information is retrieved; if it is a digital card, the physical one is searched for
     * Once the card is found, the associated account is identified using the alias and the related contract number
     * The id and simpleCode are assigned so the flow starts normally upon receiving the accounts and cards
     * @param {Object} dataDeeplink
     * @event initialize-property-upgradeable-account
     * @private
     */
    _deepLinkVerificationTdd(dataDeeplink) {
      const financialContainsData = !!Object.keys(this.financialOverviewResponse).length;
      const isDeepLinkCorrect = dataDeeplink?.deeplink === 'HTDDISF';

      if (isDeepLinkCorrect && financialContainsData) {
        this._fire('initialize-property-upgradeable-account', {});
        const lastCardDigits = dataDeeplink?.variables_terminacionTDC;
        const contracts = this.financialOverviewResponse?.data?.contracts;

        const accounts = contracts.filter(contract =>
          contract?.productType === 'ACCOUNT'
        );

        const cardFound = contracts?.find(contract =>
          contract?.productType === 'CARD' &&
          lastCardDigits === contract?.number?.slice(-4)
        );

        const physicalCard = cardFound?.detail?.physicalSupport?.id === 'VIRTUAL'
          ? contracts?.find(contract =>
            contract?.productType === 'CARD' &&
            contract?.relatedContracts[0]?.id === cardFound?.relatedContracts[0]?.id &&
            contract?.detail?.physicalSupport?.id === 'NORMAL_PLASTIC'
          )
          : cardFound;

        const associatedAccountWithTdd = accounts.find(account =>
          account?.alias === physicalCard?.alias &&
          account?.number === physicalCard?.relatedContracts[0]?.contractId
        );

        this._productIdSelected = associatedAccountWithTdd?.id;
        this._transactionsProductId = this.standIn || this.transactionsFeatureFlag === true
          ? associatedAccountWithTdd?.simpleCode
          : associatedAccountWithTdd?.id;
      }
    }
    /**
     * Fires and event to update transactions api version
     */
    _setPendingTransactionsFlag() {
      this._fire('set-pending-transactions-feature-flag', this.pendingTransactionsFeatureFlag);
    }
    /**
     * Fires and event to update transactions api version
     */
    _setTransactionsApiVersions() {
      if (this.standIn || this.transactionsFeatureFlag  === true) {
        const apiVersion = this.get('transactionsApiVersions.0');
        this._fire('set-transactions-api-version', apiVersion);
      }
    }
    /**
     * @description set not loaded account
     * @param {Object} account
     * @returns {Object}
     */
    _setNotLoadedAccount(account) {
      return {
        accountId: this.c(account, 'id'),
        loaded: false
      };
    }
    /**
     * @description Validate list
     * @param {Array} list
     * @returns Boolean
     */
    _validList(list) {
      return list && Array.isArray(list) && list.length > 0;
    }
    /**
     * @description search if current account subproduct type is excluded from the list of subproduct types that does not allow to update contract
     * @returns {Boolean}
     */
    _subproductTypeAllowsUpdateContract() {
      return !this.subProductTypes.includes(this.c(this._accountSelected, 'subProductType', ''));
    }
    /**
     * @description search if current account level allows to update/upgrade contract
     * @returns {Boolean}
     */
    _levelAllowsUpdateContract() {
      return this.updateContractAllowedLevels.includes(this._getLevel());
    }
    /**
     * @description filter accounts that are candidates to check dossier status for update or upgrade contract
     * only if account has the parameters will request post crypto documents then get dossier-id
     * @private
    */
    _candidateUpdateOrUpgradeContract() {
      return (this._subproductTypeAllowsUpdateContract()
        && this._levelAllowsUpdateContract());
    }
    /**
     * @description get level account
     * @returns {String}
     * @private
     */
    _getLevel() {
      return this.c(this._accountSelected, 'level', '');
    }
    /**
     * @description request cryptography clientid + account number
     * @emits account-manager-post-crypto-documents
     * @private
     */
    _postCryptoDocuments() {
      const accountNumber = this.c(this._accountSelected, 'description.value', '');
      if (this.clientId) {
        this._fire('account-manager-post-crypto-documents', {
          configurationParams: [
            {
              name: 'cryptoKey',
              value: 'aso-mx'
            }
          ],
          stream: `${this.clientId}${accountNumber}`,
          codecFormat: 'PLAIN'
        });
      } else {
        this._openControlVeil();
        this._requestClientId();
      }
    }
    /**
     * @description crypto data response
     * @event account-manager-get-dossier
     * @public
     */
    postSuccessCryptoData(response) {
      this._fire('account-manager-get-dossier', this.c(response, 'document', ''));
    }
    /**
     * @description Set dossiers success response
     * @param {Object} response
     * @public
     */
    getDossiersSuccessResponse(response) {
      this._closeControlVeil();
      this._accountDossierStatus = response;
      if (this._candidateUpdateOrUpgradeContract()) {
        this._checkDossierStatus();
      }
    }
    /**
     * @descriptionSet dossiers error response
     * @param {Object} response
     * @public
     * @event set-get-dossiers-on-error
     */
    getDossiersErrorResponse() {
      this._closeControlVeil();
    }
    /**
     * @description Send update contract data
     * @emits set-update-contract-restrictions
     * @public
     */
    setUpdateContractRestrictions() {
      const _upgradeModularHybrid = this.c(this.featureFlags, 'upgradeCustomer', false);
      const _upgradeModularDetailHybrid = {
        clientId: this.clientId,
        accountId: this._productIdSelected,
        accountLevel: this._getLevel(),
        productName: this._accountSelected?.title?.name,
        isPayroll: this._isPayrrollAccount(),
        simpleCode: this.currentAccountSimpleCode,
        accountNumber: this._accountSelected?.number?.slice(-4),
        entryPoint: 'alert',
        target: 'upgrade',
      };
      const restrictions = {
        confirmationType: this._updateContractWay,
        productName: this.c(this._accountSelected, 'name'),
        productNumber: this.c(this._accountSelected, 'number'),
        openingDate: this.c(this._accountSelected, 'openingDate'),
        accountId: this.currentAccountSimpleCode,
      };

      if (_upgradeModularHybrid) {
        this.dispatchEvent(new CustomEvent('navigate-to-upgrade-N2-N4-page-hybrid', {
          detail: _upgradeModularDetailHybrid,
          bubbles: true,
          composed: true
        }));
      } else {
        this._fire('navigate-to-update-account-page', restrictions);
      }
    }
    /**
     * @description reset data update contract
     * @emits set-update-contract-restrictions
     * @public
     */
    _resetUpdateContract() {
      this._accountDossierStatus = {};
      this._updateContractWay = '';
      this._fire('account-manager-set-update-contract-banner', {
        showIconMessage: false,
        showIconMessageLinkButton: false
      });
    }
    /**
     * @description Receive response from api campaigns allowing display banner
     */
    successCampaignsOffersResponse(response) {
      if (response && Object.keys(response).length > 0) {
        this.set('_offers', true);
      } else {
        this.set('_offers', false);
      }
    }
    /**
     * @description check dossier so is payroll status to show warning or blocked information: label & banner under slider
     * @private
     */
    _checkDossierStatus() {
      const payrollStatus = this.c(this.listDocumentationDossiers, 'statusType', '');
      const dossierStatus = this.c(this._accountDossierStatus, 'status.description', '');
      if (this._currentAccountAlertedByDossier()) {
        this._getPayrollWarningBanner(payrollStatus, dossierStatus);
      } else if (this._offers && this.backlogDossierStatusTypes.includes(dossierStatus)
        && !payrollStatus && this.get('featureFlags.updateContract')) {
        this._vaildateUpdateContractInformation(this._statusTypes.complete);
      }
    }
    /**
     * @description determine which banner to show based on payroll status and dossier status
     * @param {String} payrollStatus list documentation dossiers account status
     * @param {String} dossierStatus get dossier account status
     */
    _getPayrollWarningBanner(payrollStatus, dossierStatus) {
      if ((dossierStatus === 'EXP03' || dossierStatus === 'EXP04')
        && (payrollStatus === this._statusTypes.blocked || payrollStatus === this._statusTypes.incomplete)) {
        this._onProductLimitsChanged();
      } else if (dossierStatus === 'EXP02' && this.get('featureFlags.updateContract')) {
        this._vaildateUpdateContractInformation(payrollStatus);
        this._updateContractWay = 'payroll';
      }
    }
    /**
     * @description add warning label to slider card on alerted accounts for update contract
     * @param {String} message locale to show on main accoount warning label
     * @param {String} messageClass class on summary component to show warning label color
     */
    showSliderMainWarningLabel(messageClass, message) {
      this._accountsMapped = this._accountsMapped.map(account => {
        if (this.c(account, 'id') === this.c(this._accountSelected, 'id')) {
          return {
            ...account,
            statusItem: {
              class: messageClass,
              message
            }
          };
        }
      });
      this._fire('set-accounts', this._accountsMapped);
    }
    /**
     * @description Validate if current slider account is payrroll account
     * @private
     */
    _isPayrrollAccount() {
      return this._getIndicator('IS_PAYROLL_ACCOUNT');
    }
    /**
     * update amount into account dashboard array from getAccount
     * @param {Object} accountSelected
     */
    _updateAmountDashboardAccounts(accountSelected) {
      if (this._updateDashboardAccount) {
        const _accountUpdatedIndex = this.c(this.dashboardAccounts, '0.products').findIndex(account => this.c(account, 'id') ===
          this.c(accountSelected, 'id', accountSelected?.id));
        if (_accountUpdatedIndex !== -1) {
          this.set(`dashboardAccounts.0.products.${_accountUpdatedIndex}.primaryAmount`,
            Object.assign(this.dashboardAccounts[0].products[_accountUpdatedIndex].primaryAmount, {
              amount: this.c(accountSelected, 'primaryAmount.amount'),
              currency: this.c(accountSelected, 'primaryAmount.currency')
            })
          );
          this._fire('dashboard-accounts-updated', this.dashboardAccounts);
        }
      }
    }
    /**
     * @description validate which banner show and dispatch warning label
     * @param {String} payrollStatus
     * @private
     */
    _vaildateUpdateContractInformation(payrollStatus) {
      let bannerSettings = {};
      let showUpdateContractInformation = false;
      switch (payrollStatus) {
        case 'BLOCKED':
          showUpdateContractInformation = true;
          bannerSettings = this._getUpdateContractBlockedBanner();
          this._fire('account-manager-set-blocked-operations', {
            transfers: true,
            billPayment: true,
            cardlessWithdrawal: true,
            creditCardPayment: true,
            refillsAndPackages: true,
            codi: true,
            internationalTransfers: true,
            dimoSend: true,
          });
          this._fire('set-account-for-operations', this._accountSelected);
          break;
        case 'INCOMPLETE':
        case 'COMPLETE':
          this._updateContractWay = 'backlog';
          showUpdateContractInformation = true;
          bannerSettings = this._getUpdateContractWarningBanner(payrollStatus);
          break;
        default:
          break;
      }
      if (showUpdateContractInformation && !this.updateContractHasBeenMadeToday) {
        this.showSliderMainWarningLabel('warning', 'account-detail-update-contract-main-warning-label');
        this._fire('account-manager-set-update-contract-banner', bannerSettings);
      }
    }
    /**
     * @description get update contract blocked banner
     * @private
     */
    _getUpdateContractBlockedBanner() {
      return {
        showIconMessage: true,
        iconMessageType: 'error',
        iconMessageIcon: 'coronita:alert',
        messageHeadingIconInfo: 'update-contract-banner-header-error',
        messageIconInfo: '',
        iconMessageMessages: ['update-contract-banner-text1-error', '<br>', 'update-contract-banner-text2-error'],
        hideActions: false,
        showIconMessageLinkButton: false,
        buttonMessage: 'generic-conitnue-accept-btn',
        iconMessageButtonStyle: 'primary',
        iconMessageButtonEventName: 'summary-account-button-event'
      };
    }

    /**
     * get update contract warning banner
     * @param {String} payrollStatus
     * @private
     */
    _getUpdateContractWarningBanner(payrollStatus) {
      const warningHeadBannerTxt = payrollStatus === 'INCOMPLETE' ? 'update-contract-banner-header-warning-incomplete' : 'update-contract-banner-header-warning-complete';
      const warningFirstMessageTxt = payrollStatus === 'INCOMPLETE' ? 'update-contract-banner-text1-warning-incomplete' : 'update-contract-banner-text1-warning-complete';
      const warningSecondMessageTxt = payrollStatus === 'INCOMPLETE' ? 'update-contract-banner-text2-warning-incomplete' : '';
      const dueDate = payrollStatus === 'INCOMPLETE' ? moment(this._dueDateRecalculated()).format('LL.') : '';
      return {
        showIconMessage: true,
        iconMessageType: 'warning',
        iconMessageIcon: 'coronita:caution',
        messageHeadingIconInfo: warningHeadBannerTxt,
        messageIconInfo: '',
        iconMessageMessages: [warningFirstMessageTxt, '<br>', warningSecondMessageTxt,  ' ' + dueDate],
        hideActions: false,
        showIconMessageLinkButton: payrollStatus === 'INCOMPLETE' ? true : false,
        iconMessageIconLinkButton: '',
        linkButtonMessage: payrollStatus === 'INCOMPLETE' ? 'update-contract-banner-warning-link-btn' : '',
        iconMessageLinkButtonEventName: payrollStatus === 'INCOMPLETE' ? 'summary-account-link-button-event' : '',
        buttonMessage: 'generic-conitnue-accept-btn',
        iconMessageButtonStyle: 'primary',
        iconMessageButtonEventName: 'summary-account-button-event'
      };
    }
    /**
     * @description generates update contract restrictions modal configuration
     * @emits show-alert-manager-modal
     */
    openRestrictionsModal() {
      this._fire(this.alertManagerModalEvent, {
        code: 'update-contract-restrictions',
        selectedConfig: {
          className: 'full-height-error',
          hideCloseIcon: false,
          openMaximized: true,
          title: 'update-contract-restrictions-title',
          heroImage: './images/success.svg',
          message: 'update-contract-restrictions-subtitle',
          acceptBtLabel: 'update-contract-restrictions-understood',
          template: {
            type: 'paragraphs',
            values: [
              { text: ' ', class: 'spacing' },
              { text: 'update-contract-restrictions-disclaimer', class: 'text-align-left'},
              {
                list: [
                  'update-contract-restrictions-withdrawals',
                  'update-contract-restrictions-transfers',
                  'update-contract-restrictions-service-payments',
                  'update-contract-restrictions-refills-and-packs',
                  'update-contract-restrictions-qr-operations'
                ],
                class: 'cells-lists-with-text-left'
              }
            ]
          }
        }
      });
    }

    /**
     * @description set phone number
     * @param {String} number
     */
    setPhoneNumber(number) {
      if (number.length === 10) {
        this.phoneNumber = number;
      }
    }
    /**
     * Update product detail data after pocket operation success
     * @param {Object} payload
     */
    updateAccountDataAfterRefresh(payload) {
      this.set('dashboardAccounts', payload);
      this._fire('set-accounts', this._mappedAccounts(this._mappedDashboardAccounts));
      if (this._updatePockets) {
        this._getAccountData();
        this._updatePockets = false;
      }
    }
    /**
     * Show success message when changing alias
     */
    showSuccessMessage() {
      this._fire('show-success-message-alias-edited');
    }
    /**
     * Update pockets data
     */
    updatePocketsData() {
      this._updatePockets = true;
      this.updateAccountData();
    }
    /**
     * @description update account data
     * @type request account data
     */
    updateAccountData() {
      this.set('_updateDashboardAccount', true);
      this._fire('financial-overview-refresh', true);
    }
    /**
     * @description set retry account data
     * @public
     */
    setRetryGetAccount() {
      this._getAccountData();
    }
    /**
     * @description set retry account data with no refresh movements
     * @public
     */
    setRetryGetAccountNoRefresh() {
      this._noRefreshMovements = true;
      this._getAccountData();
    }
    /**
     * @decription set _pocketsAttempts data if is valid pockets
     * @param {Object} data
     * @public
     * @event set-request-pockets-balance
     */
    setRetryGetPockets() {
      this._getPockets();
    }
    /**
     * @decription show modal info
     * @public
     * @event key-values-modal
     */
    pendingDepositBalanceModal() {
      this._fire('set-pending-deposit-balance-modal-info', {
        code: 'pending-deposit-balance',
        selectedConfig: {
          className: 'full-height-info info',
          openMaximized: true,
          title: 'cells-product-summary-account-check-hold',
          acceptBtLabel: 'cells-pending-deposit-balance-accept',
          template: {
            type: 'paragraphs',
            values: [
              {
                icon: 'coronita:help'
              },
              {
                text: 'cells-pending-deposit-balance-text'
              }
            ]
          }
        }
      });
    }

    /**
     * Method to check for pockets indicator
     * @param {Object} params
     * @return {Boolean} - true if account has pockets
     */
    _hasPockets(params) {
      this.set('selectedAccountId', this.c(this._accountSelected, 'id'));
      const contracts = this.c(params, 'data.contracts');
      const products = contracts.find(product => product.id === this.selectedAccountId);
      const accountIndicators = this.c(products, 'detail.indicators');
      const hasPockets = accountIndicators.find(indicator => indicator.id === 'HAS_POCKETS');
      return this.get('isActive', hasPockets);
    }

    /**
     * @desc Set number phone just in case run in web
     * @param {Object} Data from after login
     */
    setPhoneInWeb(data) {
      if (!this.native) {
        this.phoneNumber = this.c(data, 'userId', '');
      }
    }

    /**
     * Request client id to native local storage
     * @event global-get-from-storage
     */
    _requestClientId() {
      this._fire('global-get-from-storage', { key: 'loginData', secure: true });
    }

    /**
     * handle login data from native local storage (client id)
     * @param {Object} data with clientId
     * @event global-get-from-storage
     */
    handleLoginData(data) {
      this.clientId = this.c(data, 'grantingTicketUserId', this.clientId);
      if (this._initialized && this.customerRecordsStatus) {
        this._postCryptoDocuments();
      }
    }
    /**
     * @description handle update contract success date
     * @param {String} data local storage date of update contract last success
     */
    handleUpdateContractSuccessDate(data) {
      const localStorgeData = String(data || '');
      this.updateContractHasBeenMadeToday = moment().isSame(localStorgeData, 'day');
      if (!this.updateContractHasBeenMadeToday) {
        this._fire('global-remove-from-storage', {
          key: 'update_contract_success_date',
          secure: true
        });
      }
    }
    /**
     * Handle codicel_entrypoint from native local storage
     * @param {Object} payload with codicel_entrypoint
     * @event codicel-consent-entrypoint-status
     * @event get-evidence-service
     */
    handleCodicelEntrypoint(payload) {
      let codicelConsentStatus;
      try {
        codicelConsentStatus = typeof payload === 'string' ? JSON.parse(payload) : '';
      } catch (error) {
        codicelConsentStatus = '';
      }
      if (['ALTA', 'BAJA'].includes(codicelConsentStatus.toUpperCase())) {
        this._fire('codicel-consent-entrypoint-status', codicelConsentStatus);
        return;
      }

      if (this.clientId !== 'undefined' && !this.getFlagEvidences) {
        const queryParam = `operationCode%3D%3D${this.clientId}%20and%20evidenceTypeId%3D%3DEV-MX-AO-CODCEL-001`;
        this._fire('get-evidence-service', queryParam);
        return;
      }
      this._fire('codicel-consent-entrypoint-status', '');
    }

    /**
     * Set Local Storage
     */
    _setGlobalLocalStorage() {
      this.set('getFlagEvidences', true);
      this._fire('global-set-in-storage', { key: this.evidencesStorage, value: this.getFlagEvidences });
    }
    /**
     * Get Local storage for KEY evidences_data
     * @param {*} evidencesData
     */
    getGlobalStorageEvidences(evidencesData) {
      this.getFlagEvidences = evidencesData.code === this._localStorageErrorCode ? false : evidencesData;
    }

    /**
     * Handle evidences success
     * @param {Object} payload from boveda service
     * @event codicel-consent-entrypoint-status
     * @event global-set-in-storage
     */
    handleEvidencesSuccess(payload) {
      this._closeControlVeil();
      if (payload && payload.length) {
        this._setGlobalLocalStorage();
      }
      let entrypointStatus;

      if (!payload) {
        entrypointStatus = 'Baja';
        this._fire('global-set-in-storage', { key: this.codicelKey, value: entrypointStatus });
        this._fire('codicel-consent-entrypoint-status', entrypointStatus);
        return;
      }

      const payloadIsArray = Array.isArray(payload);
      if (!payloadIsArray) {
        this._fire('codicel-consent-entrypoint-status', '');
        return;
      }

      const payloadLastElement = payload[this.c(payload, 'length') - 1];
      if (!payloadLastElement) {
        this._fire('codicel-consent-entrypoint-status', '');
        return;
      }

      const typeOfOperation = this.c(payloadLastElement, 'specificInformation', []).find(element => element.field.name === 'typeOfOperation');
      if (!typeOfOperation) {
        this._fire('codicel-consent-entrypoint-status', '');
        return;
      }

      entrypointStatus = this.c(typeOfOperation, 'value', '');
      if (!entrypointStatus) {
        this._fire('codicel-consent-entrypoint-status', '');
        return;
      }

      entrypointStatus = this._validatePhoneChange(payloadLastElement, entrypointStatus);
      const codicelConsentStatus = (entrypointStatus || '').toUpperCase();
      if (['ALTA', 'BAJA'].includes(codicelConsentStatus)) {
        this._fire('global-set-in-storage', { key: this.codicelKey, value: codicelConsentStatus === 'ALTA' ? 'Alta' : 'Baja' });
        this._fire('codicel-consent-entrypoint-status', entrypointStatus);
      }

    }

    _validatePhoneChange(payloadLastElement, entrypointStatus) {
      const nicknameService = this.c(payloadLastElement, 'specificInformation', []).find(element => element.field.name === 'nicknameService');
      const evidencesPhone = this.c(nicknameService, 'value', '');
      const validLength = (evidencesPhone.length === 10) && (this.phoneNumber.length === 10) ? true : false;
      if (validLength && evidencesPhone !== this.phoneNumber) {
        return 'BAJA';
      }
      return entrypointStatus;
    }

    /**
     * Handle evidences error
     * @param {Object} payload with boveda error
     * @event codicel-consent-entrypoint-status
     */
    handleEvidencesError(payload) {
      this._closeControlVeil();
      this._fire('codicel-consent-entrypoint-status', '');
    }

    /**
     * @description Init Stand-In services for account
     * @event set-hidden-message-icon-pokect
     * @event set-account-slide
     * @event data-incomes-summary-account
     * @event set-hidde-pending-deposit-balance-skeleton
     * @event set-account-for-operations
     */
    standInitServices() {
      this._getAccountDataStandIn();
      this._fire('set-account-slide', this._getSelectedIndexAccountStandIn(this._mappedDashboardAccounts));
      this._fire('set-hidden-message-icon-pokect', !this.standIn);
      this._fire('hide-pending-movement-link', false);
      this.setStandInHeaderTitle();
      this._fire('data-incomes-summary-account', this._buildStandInStructureAccount(this._mappedDashboardAccounts));
      this._fire('set-hidde-pending-deposit-balance-skeleton', this.standIn);
      this._fire('set-account-for-operations', this._accountSelected);
      this._fire('set-header-text', this.t('glomo-account-stand-in-pending-movements'));
    }

    /**
     * @description reset the page Account in mode Stand-In
     * @event set-product-id
     * @event set-hidden-pocket-skeleton
     * @event set-reset-operations
     * @event set-reset-transactions-list
     * @event set-get-transactions-list
     */
    _getAccountDataStandIn() {
      this._fire('set-product-id', this._productIdSelected);
      this._fire('set-transactions-product-id', this._transactionsProductId);
      this._fire('set-hidden-pocket-skeleton', this.standIn);
      this._fire('set-reset-operations');
      this._fire('set-reset-transactions-list');
      this._fire('set-get-transactions-list');
    }

    /**
    * @description validation for modal with SPEI movements
    * @idModal SPEI_MOVIMENTS_STANDIN
    * @event detail-transaction-tap
    */
    validateSpei(params) {
      const internalCode = this.get('internalCode.id', params);
      if (this.standIn && this.isCodeSpei.includes(internalCode)) {
        this.standInOperationModals({id: 'SPEI_MOVIMENTS_STANDIN'});
        return;
      }
      this.dispatchEvent(new CustomEvent('detail-transaction-tap', {
        detail: params,
        bubbles: true,
        composed: true
      }));
    }

    /**
     * @description set title mask account for header
     * @event set-stand-in-header-mask
     * @event set-stand-in-header-title
     */
    setStandInHeaderTitle() {
      const _accountSelected = this._mappedDashboardAccounts.find(account => this.c(account, 'id').includes(this._productIdSelected));
      this.set('_accountSelected', _accountSelected);
      const titleName = { titleName: this.t('glomo-account-header-title', 'Cuentas'), formattedNumber: this.c(this._accountSelected, 'description.value'), haveMaskedNumber: this.c(this._accountSelected, 'description.masked') };
      const mask = {
        mask: {
          separator: this.separator,
          chars: this.visibleChars,
          status: true
        }
      };
      this._fire('set-stand-in-header-mask', mask);
      this._fire('set-stand-in-header-title', titleName);
    }

    /**
     * @description get index selected for account
     * @returns {Number}
     */
    _getSelectedIndexAccountStandIn(response) {
      return this._mappedDashboardAccounts.findIndex(account => this.c(account, 'id') === this._productIdSelected);
    }

    /**
     * @description Build account object for Stand-In
     */
    _buildStandInStructureAccount(account) {
      const _accounts = this._mappedDashboardAccounts.map(accounts => {
        const _accountSelected = this.c(accounts, 'id') === this.c(this._accountSelected, 'id') ? {
          id: this.c(this._accountSelected, 'id'),
          heading: this.c(this._accountSelected, 'alias'),
          showIconAndMask: this.showIconAndMask,
          iconAndMask: {
            iconSrc: this.bankImg,
            mask: this.c(this._accountSelected, 'description.value'),
          },
          mainItems: [
            {
              localCurrency: this.c(this._accountSelected, 'primaryAmount.currency'),
              key: this.c(this._accountSelected, 'primaryAmount.label'),
              value: {
                amount: this.c(this._accountSelected, 'primaryAmount.amount'),
                currencyCode: this.c(this._accountSelected, 'primaryAmount.currency'),
                class: 'amount-xl'
              }
            }
          ],
          labelMoreInfo: 'cells-account-summary-account-slider-more-info',
          loaded: true
        } : {
          id: this.c(accounts, 'id'),
          loaded: false
        };
        return _accountSelected;
      });
      return _accounts;
    }

    /**
    * Return an object with different value configurations
    * for the Stand-In modal.
    * @returns {Object}
    */
    _valueSettings() {
      return {
        detailInfo: [{title: 'glomo-account-stand-in-modal-detailInfo-title', class: 'simple-title spacing--xs'}, {text: 'glomo-account-summary-stand-in-text1', class: 'grey'}],
        SPEI_MOVIMENTS_STANDIN: [{ title: 'glomo-unavailable-operation-manager-title-SPEI_MOVIMENTS_STANDIN', }, { text: 'glomo-unavailable-operation-manager-description-SPEI_MOVIMENTS_STANDIN', class: 'spacing'}],
      };
    }

    /**
    * @desc build structure modal
    */
    standInOperationModals(payload) {
      let operativeId = payload?.id || '';

      if (this.standIn) {
        const eventName = operativeId.replace(/([a-z0-9]|(?=[A-Z]))([A-Z])/g, '$1-$2').toLowerCase();
        this._fire(`stand-in-${eventName}`);
        const valueSettings = this.get(operativeId, this._valueSettings());

        if (valueSettings) {
          this._fire(this.alertManagerModalEvent, this._standInModalAccount(valueSettings, operativeId));
        }
      }
    }
    /**
     * Return Stand-In modal template
     * @returns {Object}
     */
    _standInModalAccount(values, operativeId) {
      return {
        code: 'ACCOUNT-STANDIN-VIEW-MORE',
        selectedConfig: {
          className: 'full-height-error',
          openMaximized: true,
          title: `glomo-account-stand-in-modal-${operativeId}-header-title`,
          heroImage: this.fundsImage,
          acceptBtLabel: 'glomo-stand-in-button-label',
          template: {
            type: 'paragraphs',
            values
          }
        }
      };
    }
    /**
    * @desc with or withour payroll payload for the modal
    */
    navigatePockets() {
      const eventData = this._hasPockets(this.financialOverviewResponse) ? 'navigate-to-pockets-list' : 'navigate-to-pockets-welcome';
      this._fire(eventData);
    }
    /**
    * @desc if customerRecords requeriments are complete
    * @event set-customer-records-success-response
    */
    getCustomerRecordsSuccessResponse(body) {
      if (this.get('status.id', body) === this._statusTypes.complete) {
        this.customerRecordsStatus = false;
      } else if (this.get('status.id', body) === this._statusTypes.incomplete) {
        this.customerRecordsStatus = true;
        this._fire('account-manager-get-offers', this.dossierCampaignsParams);
        this._postCryptoDocuments();
      }
    }
    /**
    * @desc handle response when customerRecords gets an error from the service then fires the same events in successResponse(INCOMPLETE)
    * @event post-customer-records-vaidate-error
    */
    getCustomerRecordsErrorResponse(payload = {}) {
      const errorDataMessage = '01277158#NO EXISTEN DATOS RELACIONADOS CON LA BUSQUEDA';
      if (payload?.messages?.[0]?.message  === errorDataMessage) {
        this.customerRecordsStatus = true;
        this._fire('account-manager-get-offers', this.dossierCampaignsParams);
        this._postCryptoDocuments();
      } else {
        this.customerRecordsStatus = false;
      }
    }
    /**
    * @desc dispatch simple code to excecute service getAccount V2
    * @event set-simple-code
    */
    _getAccountIdSimpleCode() {
      const contracts = this.get('data.contracts', this.financialOverviewResponse);
      const products = contracts.find(product => product.id === this._productIdSelected);
      const accountSimpleCode = this.get('simpleCode', products);
      this._fire('set-simple-code', accountSimpleCode);
    }
    /**
    * @desc Get data from customers service
    */
    getCustomersData(response) {
      this.participantsList = [];
      const [ customer ] = (Array.isArray(response)) ? response : [ response ];
      if (Object.keys(customer).length > 0) {
        const nameAccountholder = {
          participantId: customer?.customerId,
          firstName: customer?.firstName.toUpperCase(),
          lastName: (`${customer?.lastName} ${customer?.secondLastName || ''}`).toUpperCase(),
          participantType: {
            id: 'HOLDER',
            name: 'Holder'
          }
        };
        this.participantsList.push(nameAccountholder);
      }
    }
    /**
    * @desc get number card for financial overview
    */
    _getRelatedContractV2() {
      this._closeControlVeil();
      this.debitCardNumber = '';
      const contracts = this.get('data.contracts', this.financialOverviewResponse);
      const account = contracts.find(product => product.id === this._productIdSelected);
      const accountNumber = this.get('number', account);
      const cardSelected = contracts.find(card => card.detail?.agreementContract === accountNumber);
      const _accountSelected = this._accountSelected;
      this.set('_existRelatedDebitCard', true);
      Object.assign(_accountSelected, {
        debitCard: {
          number: this.get('number', cardSelected),
          numberType: this.get('numberType', cardSelected)
        }
      });
      this.set('_accountSelected', _accountSelected);
      this.relatedContractV2 = true;
      this._navigateToAccountMoreInfo();
    }
    /**
    * @desc return the value of flag horizonV2
    */
    _featureFlagV2check() {
      return this.featureFlags?.horizonV2 || false;
    }
    /**
    * @desc get from local storage the value of giveMoney
    */
    getDataLocalStorageGiveMoney() {
      this._fire('global-get-from-storage', { key: this.localStorageGiveMoneyKey });
    }
    /**
    * @desc evaluates the value of giveMoney to display onboarding or redirect to the transfer page
    * @param {object} storageResponse
    */
    onSuccessLocalStorageGiveMoney(storageResponse) {
      this._fire('analytics-give-money');
      if (storageResponse.isActive === true) {
        this._fire('navigate-to-give-money');
      } else {
        this._fire('navigate-to-transfers', {continue: 'continue'});
      }
    }
    /**
    * @desc evaluates the response of the local storage when an error take a place
    * @param {object} storageResponse
    */
    onErrorLocalStorageGivemoney(storageResponse) {
      if (storageResponse.code === this._localStorageErrorCode) {
        this._saveLocalStorageGiveMoneyData(true);
        this.getDataLocalStorageGiveMoney();
      } else {
        this.showTransfersPage();
      }
    }
    /**
    * @desc saves in local storage the value received for giveMoney
    * @param {bool} valueGiveMoney
    */
    _saveLocalStorageGiveMoneyData(valueGiveMoney) {
      this.set('localStorageGiveMoneyValue', {
        isActive: valueGiveMoney
      });
      this._fire('global-set-in-storage', {
        key: this.localStorageGiveMoneyKey,
        value: this.localStorageGiveMoneyValue
      });
    }
    /**
    * @desc shows the transfer page
    */
    showTransfersPage() {
      this._saveLocalStorageGiveMoneyData(false);
      this._fire('navigate-to-transfers', {continue: 'continue'});
    }

    /**
     * @desc dispatch event with selected account number on pending movements link click
     * @event account-manager-navigation-to-pending-movements
     */
    onPendingMovementsLinkClick() {
      const accountSelectedNumber = this._accountSelected?.number;
      this._fire('account-manager-navigation-to-pending-movements', {
        page: 'alwayson-pending-movements',
        params: { accountSelectedNumber }
      });
    }
  }

  customElements.define(GlomoAccountManager.is, GlomoAccountManager);
}
